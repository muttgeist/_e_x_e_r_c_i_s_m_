class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return ! knightIsAwake; //? true : false;
    }
    public static boolean canSpy(boolean knightIsAwake, 
                                 boolean archerIsAwake, 
                                 boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake); //? true : false;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, 
                                            boolean prisonerIsAwake) {
       /* if (archerIsAwake){
            return false;
        }
        if (prisonerIsAwake){
            return true;
        }
        else
            return false;*/
        /*
        00        0
        01        1
        10        0
        11        0
        */
        /*return !archerIsAwake && (!archerIsAwake || prisonerIsAwake);*/
        return !archerIsAwake &&  prisonerIsAwake;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archerIsAwake,
                                          boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {
        return !archerIsAwake && (
            petDogIsPresent || (
                prisonerIsAwake && !knightIsAwake
            ));
    }
}
