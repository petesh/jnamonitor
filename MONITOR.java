import com.sun.jna.*;
import java.util.List;
import java.util.Arrays;

public class MONITOR extends Structure {
    public int elo_mon_num;
    public int x;
    public int y;
    public int width;
    public int height;
    public int orientation;
    public byte is_primary;

    public MONITOR() {
        super();
    }

    @Override
    protected List<? > getFieldOrder() {
        return Arrays.asList("elo_mon_num", "x", "y", "width", "height", "orientation", "is_primary");
    }

    public MONITOR(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends MONITOR implements Structure.ByReference {
    };

    public static class ByValue extends MONITOR implements Structure.ByValue {
    };
}
