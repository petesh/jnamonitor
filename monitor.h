#include <windows.h>

typedef struct MONITORS_TAG
{
    int     elo_mon_num;
    int     x;
    int     y;
    int     width;
    int     height;
    DWORD   orientation;
    bool    is_primary;
} MONITOR;

typedef struct SCREEN_TAG
{
    int               nScreenIndex;
    USHORT            uVendorID;     
    USHORT            uProductID;    
    USHORT            uVersionNumber;
    wchar_t           szDevicePath [MAX_PATH];
    HANDLE            hCalTouchThread;
    MONITOR*          pMonitor;
    LPVOID            pCWndBeamHandler;
    BOOL              bIrBeams;
} SCREEN;

extern "C" {
SCREEN* EloGetScreenByIndex (int nScreenIndex);
}

