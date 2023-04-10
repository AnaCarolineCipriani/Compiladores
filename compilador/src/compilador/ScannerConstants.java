package compilador;
public interface ScannerConstants
{
	int[] SCANNER_TABLE_INDEXES = 
	    {
	        0,
	        80,
	        80,
	        81,
	        272,
	        464,
	        464,
	        464,
	        464,
	        464,
	        464,
	        464,
	        464,
	        467,
	        479,
	        479,
	        480,
	        481,
	        482,
	        518,
	        580,
	        581,
	        581,
	        581,
	        591,
	        593,
	        603,
	        613,
	        625,
	        625,
	        625,
	        625,
	        635,
	        697,
	        733,
	        924,
	        934,
	        936,
	        946,
	        956,
	        958,
	        958,
	        1150,
	        1160,
	        1160
	    };

	    int[][] SCANNER_TABLE = 
	    {
	        {9, 1},
	        {10, 1},
	        {32, 1},
	        {33, 2},
	        {34, 3},
	        {35, 4},
	        {40, 5},
	        {41, 6},
	        {42, 7},
	        {43, 8},
	        {44, 9},
	        {45, 10},
	        {47, 11},
	        {48, 12},
	        {49, 13},
	        {50, 13},
	        {51, 13},
	        {52, 13},
	        {53, 13},
	        {54, 13},
	        {55, 13},
	        {56, 13},
	        {57, 13},
	        {58, 14},
	        {60, 15},
	        {61, 16},
	        {62, 17},
	        {65, 18},
	        {66, 18},
	        {67, 18},
	        {68, 18},
	        {69, 18},
	        {70, 18},
	        {71, 18},
	        {72, 18},
	        {73, 18},
	        {74, 18},
	        {75, 18},
	        {76, 18},
	        {77, 18},
	        {78, 18},
	        {79, 18},
	        {80, 18},
	        {81, 18},
	        {82, 18},
	        {83, 18},
	        {84, 18},
	        {85, 18},
	        {86, 18},
	        {87, 18},
	        {88, 18},
	        {89, 18},
	        {90, 18},
	        {97, 19},
	        {98, 19},
	        {99, 19},
	        {100, 19},
	        {101, 19},
	        {102, 19},
	        {103, 19},
	        {104, 19},
	        {105, 19},
	        {106, 19},
	        {107, 19},
	        {108, 19},
	        {109, 19},
	        {110, 19},
	        {111, 19},
	        {112, 19},
	        {113, 19},
	        {114, 19},
	        {115, 19},
	        {116, 19},
	        {117, 19},
	        {118, 19},
	        {119, 19},
	        {120, 19},
	        {121, 19},
	        {122, 19},
	        {123, 20},
	        {61, 21},
	        {9, 3},
	        {13, 3},
	        {32, 3},
	        {33, 3},
	        {34, 22},
	        {35, 3},
	        {36, 3},
	        {37, 3},
	        {38, 3},
	        {39, 3},
	        {40, 3},
	        {41, 3},
	        {42, 3},
	        {43, 3},
	        {44, 3},
	        {45, 3},
	        {46, 3},
	        {47, 3},
	        {48, 3},
	        {49, 3},
	        {50, 3},
	        {51, 3},
	        {52, 3},
	        {53, 3},
	        {54, 3},
	        {55, 3},
	        {56, 3},
	        {57, 3},
	        {58, 3},
	        {59, 3},
	        {60, 3},
	        {61, 3},
	        {62, 3},
	        {63, 3},
	        {64, 3},
	        {65, 3},
	        {66, 3},
	        {67, 3},
	        {68, 3},
	        {69, 3},
	        {70, 3},
	        {71, 3},
	        {72, 3},
	        {73, 3},
	        {74, 3},
	        {75, 3},
	        {76, 3},
	        {77, 3},
	        {78, 3},
	        {79, 3},
	        {80, 3},
	        {81, 3},
	        {82, 3},
	        {83, 3},
	        {84, 3},
	        {85, 3},
	        {86, 3},
	        {87, 3},
	        {88, 3},
	        {89, 3},
	        {90, 3},
	        {91, 3},
	        {93, 3},
	        {94, 3},
	        {95, 3},
	        {96, 3},
	        {97, 3},
	        {98, 3},
	        {99, 3},
	        {100, 3},
	        {101, 3},
	        {102, 3},
	        {103, 3},
	        {104, 3},
	        {105, 3},
	        {106, 3},
	        {107, 3},
	        {108, 3},
	        {109, 3},
	        {110, 3},
	        {111, 3},
	        {112, 3},
	        {113, 3},
	        {114, 3},
	        {115, 3},
	        {116, 3},
	        {117, 3},
	        {118, 3},
	        {119, 3},
	        {120, 3},
	        {121, 3},
	        {122, 3},
	        {123, 3},
	        {124, 3},
	        {125, 3},
	        {126, 3},
	        {161, 3},
	        {162, 3},
	        {163, 3},
	        {164, 3},
	        {165, 3},
	        {166, 3},
	        {167, 3},
	        {168, 3},
	        {169, 3},
	        {170, 3},
	        {171, 3},
	        {172, 3},
	        {173, 3},
	        {174, 3},
	        {175, 3},
	        {176, 3},
	        {177, 3},
	        {178, 3},
	        {179, 3},
	        {180, 3},
	        {181, 3},
	        {182, 3},
	        {183, 3},
	        {184, 3},
	        {185, 3},
	        {186, 3},
	        {187, 3},
	        {188, 3},
	        {189, 3},
	        {190, 3},
	        {191, 3},
	        {192, 3},
	        {193, 3},
	        {194, 3},
	        {195, 3},
	        {196, 3},
	        {197, 3},
	        {198, 3},
	        {199, 3},
	        {200, 3},
	        {201, 3},
	        {202, 3},
	        {203, 3},
	        {204, 3},
	        {205, 3},
	        {206, 3},
	        {207, 3},
	        {208, 3},
	        {209, 3},
	        {210, 3},
	        {211, 3},
	        {212, 3},
	        {213, 3},
	        {214, 3},
	        {215, 3},
	        {216, 3},
	        {217, 3},
	        {218, 3},
	        {219, 3},
	        {220, 3},
	        {221, 3},
	        {222, 3},
	        {223, 3},
	        {224, 3},
	        {225, 3},
	        {226, 3},
	        {227, 3},
	        {228, 3},
	        {229, 3},
	        {230, 3},
	        {231, 3},
	        {232, 3},
	        {233, 3},
	        {234, 3},
	        {235, 3},
	        {236, 3},
	        {237, 3},
	        {238, 3},
	        {239, 3},
	        {240, 3},
	        {241, 3},
	        {242, 3},
	        {243, 3},
	        {244, 3},
	        {245, 3},
	        {246, 3},
	        {247, 3},
	        {248, 3},
	        {249, 3},
	        {250, 3},
	        {251, 3},
	        {252, 3},
	        {253, 3},
	        {254, 3},
	        {255, 3},
	        {9, 4},
	        {13, 4},
	        {32, 4},
	        {33, 4},
	        {34, 4},
	        {35, 4},
	        {36, 4},
	        {37, 4},
	        {38, 4},
	        {39, 4},
	        {40, 4},
	        {41, 4},
	        {42, 4},
	        {43, 4},
	        {44, 4},
	        {45, 4},
	        {46, 4},
	        {47, 4},
	        {48, 4},
	        {49, 4},
	        {50, 4},
	        {51, 4},
	        {52, 4},
	        {53, 4},
	        {54, 4},
	        {55, 4},
	        {56, 4},
	        {57, 4},
	        {58, 4},
	        {59, 4},
	        {60, 4},
	        {61, 4},
	        {62, 4},
	        {63, 4},
	        {64, 4},
	        {65, 4},
	        {66, 4},
	        {67, 4},
	        {68, 4},
	        {69, 4},
	        {70, 4},
	        {71, 4},
	        {72, 4},
	        {73, 4},
	        {74, 4},
	        {75, 4},
	        {76, 4},
	        {77, 4},
	        {78, 4},
	        {79, 4},
	        {80, 4},
	        {81, 4},
	        {82, 4},
	        {83, 4},
	        {84, 4},
	        {85, 4},
	        {86, 4},
	        {87, 4},
	        {88, 4},
	        {89, 4},
	        {90, 4},
	        {91, 4},
	        {92, 4},
	        {93, 4},
	        {94, 4},
	        {95, 4},
	        {96, 4},
	        {97, 4},
	        {98, 4},
	        {99, 4},
	        {100, 4},
	        {101, 4},
	        {102, 4},
	        {103, 4},
	        {104, 4},
	        {105, 4},
	        {106, 4},
	        {107, 4},
	        {108, 4},
	        {109, 4},
	        {110, 4},
	        {111, 4},
	        {112, 4},
	        {113, 4},
	        {114, 4},
	        {115, 4},
	        {116, 4},
	        {117, 4},
	        {118, 4},
	        {119, 4},
	        {120, 4},
	        {121, 4},
	        {122, 4},
	        {123, 4},
	        {124, 4},
	        {125, 4},
	        {126, 4},
	        {161, 4},
	        {162, 4},
	        {163, 4},
	        {164, 4},
	        {165, 4},
	        {166, 4},
	        {167, 4},
	        {168, 4},
	        {169, 4},
	        {170, 4},
	        {171, 4},
	        {172, 4},
	        {173, 4},
	        {174, 4},
	        {175, 4},
	        {176, 4},
	        {177, 4},
	        {178, 4},
	        {179, 4},
	        {180, 4},
	        {181, 4},
	        {182, 4},
	        {183, 4},
	        {184, 4},
	        {185, 4},
	        {186, 4},
	        {187, 4},
	        {188, 4},
	        {189, 4},
	        {190, 4},
	        {191, 4},
	        {192, 4},
	        {193, 4},
	        {194, 4},
	        {195, 4},
	        {196, 4},
	        {197, 4},
	        {198, 4},
	        {199, 4},
	        {200, 4},
	        {201, 4},
	        {202, 4},
	        {203, 4},
	        {204, 4},
	        {205, 4},
	        {206, 4},
	        {207, 4},
	        {208, 4},
	        {209, 4},
	        {210, 4},
	        {211, 4},
	        {212, 4},
	        {213, 4},
	        {214, 4},
	        {215, 4},
	        {216, 4},
	        {217, 4},
	        {218, 4},
	        {219, 4},
	        {220, 4},
	        {221, 4},
	        {222, 4},
	        {223, 4},
	        {224, 4},
	        {225, 4},
	        {226, 4},
	        {227, 4},
	        {228, 4},
	        {229, 4},
	        {230, 4},
	        {231, 4},
	        {232, 4},
	        {233, 4},
	        {234, 4},
	        {235, 4},
	        {236, 4},
	        {237, 4},
	        {238, 4},
	        {239, 4},
	        {240, 4},
	        {241, 4},
	        {242, 4},
	        {243, 4},
	        {244, 4},
	        {245, 4},
	        {246, 4},
	        {247, 4},
	        {248, 4},
	        {249, 4},
	        {250, 4},
	        {251, 4},
	        {252, 4},
	        {253, 4},
	        {254, 4},
	        {255, 4},
	        {44, 23},
	        {66, 24},
	        {98, 24},
	        {44, 25},
	        {46, 26},
	        {48, 27},
	        {49, 27},
	        {50, 27},
	        {51, 27},
	        {52, 27},
	        {53, 27},
	        {54, 27},
	        {55, 27},
	        {56, 27},
	        {57, 27},
	        {61, 28},
	        {61, 29},
	        {61, 30},
	        {48, 31},
	        {49, 31},
	        {50, 31},
	        {51, 31},
	        {52, 31},
	        {53, 31},
	        {54, 31},
	        {55, 31},
	        {56, 31},
	        {57, 31},
	        {97, 32},
	        {98, 32},
	        {99, 32},
	        {100, 32},
	        {101, 32},
	        {102, 32},
	        {103, 32},
	        {104, 32},
	        {105, 32},
	        {106, 32},
	        {107, 32},
	        {108, 32},
	        {109, 32},
	        {110, 32},
	        {111, 32},
	        {112, 32},
	        {113, 32},
	        {114, 32},
	        {115, 32},
	        {116, 32},
	        {117, 32},
	        {118, 32},
	        {119, 32},
	        {120, 32},
	        {121, 32},
	        {122, 32},
	        {48, 31},
	        {49, 31},
	        {50, 31},
	        {51, 31},
	        {52, 31},
	        {53, 31},
	        {54, 31},
	        {55, 31},
	        {56, 31},
	        {57, 31},
	        {65, 33},
	        {66, 33},
	        {67, 33},
	        {68, 33},
	        {69, 33},
	        {70, 33},
	        {71, 33},
	        {72, 33},
	        {73, 33},
	        {74, 33},
	        {75, 33},
	        {76, 33},
	        {77, 33},
	        {78, 33},
	        {79, 33},
	        {80, 33},
	        {81, 33},
	        {82, 33},
	        {83, 33},
	        {84, 33},
	        {85, 33},
	        {86, 33},
	        {87, 33},
	        {88, 33},
	        {89, 33},
	        {90, 33},
	        {97, 19},
	        {98, 19},
	        {99, 19},
	        {100, 19},
	        {101, 19},
	        {102, 19},
	        {103, 19},
	        {104, 19},
	        {105, 19},
	        {106, 19},
	        {107, 19},
	        {108, 19},
	        {109, 19},
	        {110, 19},
	        {111, 19},
	        {112, 19},
	        {113, 19},
	        {114, 19},
	        {115, 19},
	        {116, 19},
	        {117, 19},
	        {118, 19},
	        {119, 19},
	        {120, 19},
	        {121, 19},
	        {122, 19},
	        {10, 34},
	        {48, 35},
	        {49, 35},
	        {50, 35},
	        {51, 35},
	        {52, 35},
	        {53, 35},
	        {54, 35},
	        {55, 35},
	        {56, 35},
	        {57, 35},
	        {48, 36},
	        {49, 36},
	        {48, 37},
	        {49, 37},
	        {50, 37},
	        {51, 37},
	        {52, 37},
	        {53, 37},
	        {54, 37},
	        {55, 37},
	        {56, 37},
	        {57, 37},
	        {48, 38},
	        {49, 38},
	        {50, 38},
	        {51, 38},
	        {52, 38},
	        {53, 38},
	        {54, 38},
	        {55, 38},
	        {56, 38},
	        {57, 38},
	        {44, 25},
	        {46, 26},
	        {48, 39},
	        {49, 39},
	        {50, 39},
	        {51, 39},
	        {52, 39},
	        {53, 39},
	        {54, 39},
	        {55, 39},
	        {56, 39},
	        {57, 39},
	        {48, 40},
	        {49, 40},
	        {50, 40},
	        {51, 40},
	        {52, 40},
	        {53, 40},
	        {54, 40},
	        {55, 40},
	        {56, 40},
	        {57, 40},
	        {48, 31},
	        {49, 31},
	        {50, 31},
	        {51, 31},
	        {52, 31},
	        {53, 31},
	        {54, 31},
	        {55, 31},
	        {56, 31},
	        {57, 31},
	        {65, 18},
	        {66, 18},
	        {67, 18},
	        {68, 18},
	        {69, 18},
	        {70, 18},
	        {71, 18},
	        {72, 18},
	        {73, 18},
	        {74, 18},
	        {75, 18},
	        {76, 18},
	        {77, 18},
	        {78, 18},
	        {79, 18},
	        {80, 18},
	        {81, 18},
	        {82, 18},
	        {83, 18},
	        {84, 18},
	        {85, 18},
	        {86, 18},
	        {87, 18},
	        {88, 18},
	        {89, 18},
	        {90, 18},
	        {97, 32},
	        {98, 32},
	        {99, 32},
	        {100, 32},
	        {101, 32},
	        {102, 32},
	        {103, 32},
	        {104, 32},
	        {105, 32},
	        {106, 32},
	        {107, 32},
	        {108, 32},
	        {109, 32},
	        {110, 32},
	        {111, 32},
	        {112, 32},
	        {113, 32},
	        {114, 32},
	        {115, 32},
	        {116, 32},
	        {117, 32},
	        {118, 32},
	        {119, 32},
	        {120, 32},
	        {121, 32},
	        {122, 32},
	        {48, 31},
	        {49, 31},
	        {50, 31},
	        {51, 31},
	        {52, 31},
	        {53, 31},
	        {54, 31},
	        {55, 31},
	        {56, 31},
	        {57, 31},
	        {97, 19},
	        {98, 19},
	        {99, 19},
	        {100, 19},
	        {101, 19},
	        {102, 19},
	        {103, 19},
	        {104, 19},
	        {105, 19},
	        {106, 19},
	        {107, 19},
	        {108, 19},
	        {109, 19},
	        {110, 19},
	        {111, 19},
	        {112, 19},
	        {113, 19},
	        {114, 19},
	        {115, 19},
	        {116, 19},
	        {117, 19},
	        {118, 19},
	        {119, 19},
	        {120, 19},
	        {121, 19},
	        {122, 19},
	        {9, 34},
	        {10, 41},
	        {13, 34},
	        {32, 34},
	        {33, 34},
	        {34, 34},
	        {35, 34},
	        {36, 34},
	        {37, 34},
	        {38, 34},
	        {39, 34},
	        {40, 34},
	        {41, 34},
	        {42, 34},
	        {43, 34},
	        {44, 34},
	        {45, 34},
	        {46, 34},
	        {47, 34},
	        {48, 34},
	        {49, 34},
	        {50, 34},
	        {51, 34},
	        {52, 34},
	        {53, 34},
	        {54, 34},
	        {55, 34},
	        {56, 34},
	        {57, 34},
	        {58, 34},
	        {59, 34},
	        {60, 34},
	        {61, 34},
	        {62, 34},
	        {63, 34},
	        {64, 34},
	        {65, 34},
	        {66, 34},
	        {67, 34},
	        {68, 34},
	        {69, 34},
	        {70, 34},
	        {71, 34},
	        {72, 34},
	        {73, 34},
	        {74, 34},
	        {75, 34},
	        {76, 34},
	        {77, 34},
	        {78, 34},
	        {79, 34},
	        {80, 34},
	        {81, 34},
	        {82, 34},
	        {83, 34},
	        {84, 34},
	        {85, 34},
	        {86, 34},
	        {87, 34},
	        {88, 34},
	        {89, 34},
	        {90, 34},
	        {91, 34},
	        {92, 34},
	        {93, 34},
	        {94, 34},
	        {95, 34},
	        {96, 34},
	        {97, 34},
	        {98, 34},
	        {99, 34},
	        {100, 34},
	        {101, 34},
	        {102, 34},
	        {103, 34},
	        {104, 34},
	        {105, 34},
	        {106, 34},
	        {107, 34},
	        {108, 34},
	        {109, 34},
	        {110, 34},
	        {111, 34},
	        {112, 34},
	        {113, 34},
	        {114, 34},
	        {115, 34},
	        {116, 34},
	        {117, 34},
	        {118, 34},
	        {119, 34},
	        {120, 34},
	        {121, 34},
	        {122, 34},
	        {124, 34},
	        {126, 34},
	        {161, 34},
	        {162, 34},
	        {163, 34},
	        {164, 34},
	        {165, 34},
	        {166, 34},
	        {167, 34},
	        {168, 34},
	        {169, 34},
	        {170, 34},
	        {171, 34},
	        {172, 34},
	        {173, 34},
	        {174, 34},
	        {175, 34},
	        {176, 34},
	        {177, 34},
	        {178, 34},
	        {179, 34},
	        {180, 34},
	        {181, 34},
	        {182, 34},
	        {183, 34},
	        {184, 34},
	        {185, 34},
	        {186, 34},
	        {187, 34},
	        {188, 34},
	        {189, 34},
	        {190, 34},
	        {191, 34},
	        {192, 34},
	        {193, 34},
	        {194, 34},
	        {195, 34},
	        {196, 34},
	        {197, 34},
	        {198, 34},
	        {199, 34},
	        {200, 34},
	        {201, 34},
	        {202, 34},
	        {203, 34},
	        {204, 34},
	        {205, 34},
	        {206, 34},
	        {207, 34},
	        {208, 34},
	        {209, 34},
	        {210, 34},
	        {211, 34},
	        {212, 34},
	        {213, 34},
	        {214, 34},
	        {215, 34},
	        {216, 34},
	        {217, 34},
	        {218, 34},
	        {219, 34},
	        {220, 34},
	        {221, 34},
	        {222, 34},
	        {223, 34},
	        {224, 34},
	        {225, 34},
	        {226, 34},
	        {227, 34},
	        {228, 34},
	        {229, 34},
	        {230, 34},
	        {231, 34},
	        {232, 34},
	        {233, 34},
	        {234, 34},
	        {235, 34},
	        {236, 34},
	        {237, 34},
	        {238, 34},
	        {239, 34},
	        {240, 34},
	        {241, 34},
	        {242, 34},
	        {243, 34},
	        {244, 34},
	        {245, 34},
	        {246, 34},
	        {247, 34},
	        {248, 34},
	        {249, 34},
	        {250, 34},
	        {251, 34},
	        {252, 34},
	        {253, 34},
	        {254, 34},
	        {255, 34},
	        {48, 35},
	        {49, 35},
	        {50, 35},
	        {51, 35},
	        {52, 35},
	        {53, 35},
	        {54, 35},
	        {55, 35},
	        {56, 35},
	        {57, 35},
	        {48, 36},
	        {49, 36},
	        {48, 37},
	        {49, 37},
	        {50, 37},
	        {51, 37},
	        {52, 37},
	        {53, 37},
	        {54, 37},
	        {55, 37},
	        {56, 37},
	        {57, 37},
	        {48, 42},
	        {49, 42},
	        {50, 42},
	        {51, 42},
	        {52, 42},
	        {53, 42},
	        {54, 42},
	        {55, 42},
	        {56, 42},
	        {57, 42},
	        {44, 25},
	        {46, 26},
	        {9, 34},
	        {10, 41},
	        {13, 34},
	        {32, 34},
	        {33, 34},
	        {34, 34},
	        {35, 34},
	        {36, 34},
	        {37, 34},
	        {38, 34},
	        {39, 34},
	        {40, 34},
	        {41, 34},
	        {42, 34},
	        {43, 34},
	        {44, 34},
	        {45, 34},
	        {46, 34},
	        {47, 34},
	        {48, 34},
	        {49, 34},
	        {50, 34},
	        {51, 34},
	        {52, 34},
	        {53, 34},
	        {54, 34},
	        {55, 34},
	        {56, 34},
	        {57, 34},
	        {58, 34},
	        {59, 34},
	        {60, 34},
	        {61, 34},
	        {62, 34},
	        {63, 34},
	        {64, 34},
	        {65, 34},
	        {66, 34},
	        {67, 34},
	        {68, 34},
	        {69, 34},
	        {70, 34},
	        {71, 34},
	        {72, 34},
	        {73, 34},
	        {74, 34},
	        {75, 34},
	        {76, 34},
	        {77, 34},
	        {78, 34},
	        {79, 34},
	        {80, 34},
	        {81, 34},
	        {82, 34},
	        {83, 34},
	        {84, 34},
	        {85, 34},
	        {86, 34},
	        {87, 34},
	        {88, 34},
	        {89, 34},
	        {90, 34},
	        {91, 34},
	        {92, 34},
	        {93, 34},
	        {94, 34},
	        {95, 34},
	        {96, 34},
	        {97, 34},
	        {98, 34},
	        {99, 34},
	        {100, 34},
	        {101, 34},
	        {102, 34},
	        {103, 34},
	        {104, 34},
	        {105, 34},
	        {106, 34},
	        {107, 34},
	        {108, 34},
	        {109, 34},
	        {110, 34},
	        {111, 34},
	        {112, 34},
	        {113, 34},
	        {114, 34},
	        {115, 34},
	        {116, 34},
	        {117, 34},
	        {118, 34},
	        {119, 34},
	        {120, 34},
	        {121, 34},
	        {122, 34},
	        {124, 34},
	        {125, 43},
	        {126, 34},
	        {161, 34},
	        {162, 34},
	        {163, 34},
	        {164, 34},
	        {165, 34},
	        {166, 34},
	        {167, 34},
	        {168, 34},
	        {169, 34},
	        {170, 34},
	        {171, 34},
	        {172, 34},
	        {173, 34},
	        {174, 34},
	        {175, 34},
	        {176, 34},
	        {177, 34},
	        {178, 34},
	        {179, 34},
	        {180, 34},
	        {181, 34},
	        {182, 34},
	        {183, 34},
	        {184, 34},
	        {185, 34},
	        {186, 34},
	        {187, 34},
	        {188, 34},
	        {189, 34},
	        {190, 34},
	        {191, 34},
	        {192, 34},
	        {193, 34},
	        {194, 34},
	        {195, 34},
	        {196, 34},
	        {197, 34},
	        {198, 34},
	        {199, 34},
	        {200, 34},
	        {201, 34},
	        {202, 34},
	        {203, 34},
	        {204, 34},
	        {205, 34},
	        {206, 34},
	        {207, 34},
	        {208, 34},
	        {209, 34},
	        {210, 34},
	        {211, 34},
	        {212, 34},
	        {213, 34},
	        {214, 34},
	        {215, 34},
	        {216, 34},
	        {217, 34},
	        {218, 34},
	        {219, 34},
	        {220, 34},
	        {221, 34},
	        {222, 34},
	        {223, 34},
	        {224, 34},
	        {225, 34},
	        {226, 34},
	        {227, 34},
	        {228, 34},
	        {229, 34},
	        {230, 34},
	        {231, 34},
	        {232, 34},
	        {233, 34},
	        {234, 34},
	        {235, 34},
	        {236, 34},
	        {237, 34},
	        {238, 34},
	        {239, 34},
	        {240, 34},
	        {241, 34},
	        {242, 34},
	        {243, 34},
	        {244, 34},
	        {245, 34},
	        {246, 34},
	        {247, 34},
	        {248, 34},
	        {249, 34},
	        {250, 34},
	        {251, 34},
	        {252, 34},
	        {253, 34},
	        {254, 34},
	        {255, 34},
	        {48, 39},
	        {49, 39},
	        {50, 39},
	        {51, 39},
	        {52, 39},
	        {53, 39},
	        {54, 39},
	        {55, 39},
	        {56, 39},
	        {57, 39}
	    };

	    int[] TOKEN_STATE = {-2,  0, -1, -1,  0, 22, 23, 32, 30, 19, 31, 33,  3,  3, 20, 26, 21, 28,  2,  2, -2, 25,  6, -1, -1, -1, -1,  3, 27, 24, 29,  2,  2,  2, -2,  4,  5,  4, -1,  3,  2, -2, -1,  0 };

	    int[] SPECIAL_CASES_INDEXES =
	        { 0, 0, 0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };

	    String[] SPECIAL_CASES_KEYS =
	        {  "and", "check", "else", "end", "false", "if", "not", "or", "read", "true", "write", "writeln" };

	    int[] SPECIAL_CASES_VALUES =
	        {  8, 7, 9, 10, 11, 18, 12, 13, 14, 15, 16, 17 };
	    
    String[] SCANNER_ERROR =
    {
        "símbolo inválido", 
        "",
        "símbolo inválido", 
        "constante_string inválida",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "comentário de bloco inválido ou não finalizado",
        "",
        "",
        "constante_float inválida",
        "constante_binaria inválida",
        "constante_float inválida",
        "constante_int ou constante_float inválida",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "comentário de bloco inválido ou não finalizado",
        "",
        "",
        "",
        "constante_int ou constante_float inválida",
        "",
        "",
        "comentário de bloco inválido ou não finalizado",
        "constante_int ou constante_float inválida",
        ""
    };

}
