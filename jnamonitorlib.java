import com.sun.jna.*;
import com.sun.jna.win32.*;

public class jnamonitorlib {
	public interface moni extends StdCallLibrary {
		moni instance = (moni)Native.loadLibrary("jna-monitor", moni.class);

		SCREEN EloGetScreenByIndex (int nScreenIndex);
	};
	public static void main(String[] args) {
		SCREEN ref = moni.instance.EloGetScreenByIndex(1);

		System.out.println(ref.nScreenIndex);
		System.out.println(ref.hCalTouchThread);
		System.out.println(ref.bIrBeams);
		System.out.println(ref.pMonitor);
	}
}
