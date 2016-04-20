import com.sun.jna.*;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.PointerByReference;
import java.util.List;
import java.util.Arrays;

public class SCREEN extends Structure {
    public int nScreenIndex;
    public short uVendorID;
    public short uProductID;
    public short uVersionNumber;
    public char[] szDevicePath = new char[WinDef.MAX_PATH];
    public WinNT.HANDLE hCalTouchThread;
    public MONITOR.ByReference pMonitor;
    public PointerByReference pCWndBeamHandler;
    public boolean bIrBeams;
    
	public SCREEN() { super(); }

	@Override
	protected List<?> getFieldOrder() {
		return Arrays.asList("nScreenIndex", "uVendorID", "uProductID",
				"uVersionNumber", "szDevicePath", "hCalTouchThread",
				"pMonitor", "pCWndBeamHandler", "bIrBeams");
	}

	public SCREEN(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends SCREEN implements Structure.ByReference {
	};

	public static class ByValue extends SCREEN implements Structure.ByValue {
	};
}
