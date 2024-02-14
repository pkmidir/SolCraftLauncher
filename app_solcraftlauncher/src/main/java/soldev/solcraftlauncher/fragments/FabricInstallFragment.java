package soldev.solcraftlauncher.fragments;

import soldev.solcraftlauncher.modloaders.FabriclikeUtils;
import soldev.solcraftlauncher.modloaders.ModloaderListenerProxy;

public class FabricInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "FabricInstallFragment";
    private static ModloaderListenerProxy sTaskProxy;

    public FabricInstallFragment() {
        super(FabriclikeUtils.FABRIC_UTILS);
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
