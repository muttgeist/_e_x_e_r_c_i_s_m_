class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return ! knightIsAwake ? true : false;
    }
    public static boolean canSpy(boolean knightIsAwake, 
                                 boolean archerIsAwake, 
                                 boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || 
                prisonerIsAwake) ? true : false;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, 
                                            boolean prisonerIsAwake) {
        if (archerIsAwake){
            return false;
        }
        if (prisonerIsAwake){
            return true;
        }
        else
            return false;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, 
                                          boolean archerIsAwake, 
                                          boolean prisonerIsAwake, 
                                          boolean petDogIsPresent) {
        if (knightIsAwake && archerIsAwake && prisonerIsAwake && petDogIsPresent){
            return false;
        }
        else if (knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent){
            return true;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent){
            return true;
        }
        else if (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return true;
        }
        else if (!knightIsAwake && archerIsAwake && !prisonerIsAwake && petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && !prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent){
            return true;
        }
        else if (knightIsAwake && archerIsAwake && prisonerIsAwake && petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
        else if (!knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent){
            return false;
        }
         else if (knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent){
            return true;
        }
        else{
            return false;
        }
}
}
