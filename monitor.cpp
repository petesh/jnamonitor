
#include "monitor.h"
#include <iostream>
using std::cout;
using std::endl;

SCREEN *
EloGetScreenByIndex(int index)
{
    static SCREEN toRet;
    static MONITOR toRetMon;
    toRet.nScreenIndex = index;
    toRet.uVendorID = index * 2;
    toRet.uProductID = index * 3;
    toRet.uVersionNumber = index * 4;
    toRet.hCalTouchThread = 0;
    toRet.pMonitor = &toRetMon;
    toRet.pCWndBeamHandler = 0;
    toRet.bIrBeams = 0;
	toRetMon.elo_mon_num = index;
	toRetMon.x = index;
	toRetMon.y = index;
	toRetMon.width = index * 4;
	toRetMon.height = index * 4;
	toRetMon.orientation = 1;
	toRetMon.is_primary = true;
	cout << "Index: " << index << endl;
    return &toRet;
}
