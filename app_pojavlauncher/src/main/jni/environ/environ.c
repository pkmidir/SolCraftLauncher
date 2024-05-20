//
// Created by maks on 24.09.2022.
//

#include <stdlib.h>
#include <android/log.h>
#include <assert.h>
#include <string.h>
#include "environ.h"
struct solcraft_environ_s *solcraft_environ;
__attribute__((constructor)) void env_init() {
    char* strptr_env = getenv("SCL_ENVIRON");
    if(strptr_env == NULL) {
        __android_log_print(ANDROID_LOG_INFO, "Environ", "No environ found, creating...");
        solcraft_environ = malloc(sizeof(struct solcraft_environ_s));
        assert(solcraft_environ);
        memset(solcraft_environ, 0 , sizeof(struct solcraft_environ_s));
        if(asprintf(&strptr_env, "%p", solcraft_environ) == -1) abort();
        setenv("SCL_ENVIRON", strptr_env, 1);
        free(strptr_env);
    }else{
        __android_log_print(ANDROID_LOG_INFO, "Environ", "Found existing environ: %s", strptr_env);
        solcraft_environ = (void*) strtoul(strptr_env, NULL, 0x10);
    }
    __android_log_print(ANDROID_LOG_INFO, "Environ", "%p", solcraft_environ);
}