package soldev.solcraftlauncher.fragments;

import soldev.solcraftlauncher.modloaders.FabriclikeUtils;
import soldev.solcraftlauncher.modloaders.ModloaderListenerProxy;

public class QuiltInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "QuiltInstallFragment";
    private static ModloaderListenerProxy sTaskProxy;

    public QuiltInstallFragment() {
        super(FabriclikeUtils.QUILT_UTILS);
    }

    @Override
    protected ModloaderListenerProxy getListenerProxy() {
        return sTaskProxy;
    }

    @Override
    protected void setListenerProxy(ModloaderListenerProxy listenerProxy) {
        sTaskProxy = listenerProxy;
    }
}
