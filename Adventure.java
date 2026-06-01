import java.util.Scanner;
public class Adventure {

  private Scanner scan;
  private Player player;
  private String name;
  private int creditPoints;
  private int numLives;

  

  
  public Adventure()
  {
    this.numLives = 2;
    this.creditPoints = 50;
    this.scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String newName = scan.nextLine();

    this.player = new Player(newName);
  }
  
  
  public void start()
  {
    Util.clearConsole();
    System.out.println(StringConstants.GAME_TITLE);
    System.out.println(StringArt.COVER_ART);
    System.out.println(StringConstants.GAME_DESCRIPTION);

    Util.pauseConsole();
    System.out.println(StringConstants.START_SCENARIO);
    System.out.println("1. \t" + StringConstants.START_OPT1);
    System.out.println("2. \t" + StringConstants.START_OPT2);
    System.out.println("3. \t" + StringConstants.START_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      creditPoints+=10;
      cryBaby();
    }
    else if (choice == 2)
    {
      creditPoints+=10;
      calmBaby();
    }    
    else if (choice == 3)    
    {
      
      creditPoints+=10;
      sleepBaby();
    }
  }


  private void cryBaby()
  {
    Util.clearConsole();
    System.out.println(StringConstants.CRY_BABY_SCENARIO);
    System.out.println("1. \t" + StringConstants.CRY_BABY_OPT1);
    System.out.println("2. \t" + StringConstants.CRY_BABY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      dayCryer();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      nightCryer();
    }
  }

  private void calmBaby()
  {
    Util.clearConsole();
    System.out.println(StringConstants.CALM_BABY_SCENARIO);
    System.out.println("1. \t" + StringConstants.CALM_BABY_OPT1);
    System.out.println("2. \t" + StringConstants.CALM_BABY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=25;
      listenClosely();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      wandersOff();
    }
  }

  private void sleepBaby()
  {
    Util.clearConsole();
    System.out.println(StringConstants.ALWAYS_SLEEPING_BABY_SCENARIO);
    System.out.println("1. \t" + StringConstants.ALWAYS_SLEEPING_BABY_OPT1);
    System.out.println("2. \t" + StringConstants.ALWAYS_SLEEPING_BABY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=5;
      onlyWakeAtMealTime();
    }
    else if (choice == 2)
    {
      
      creditPoints+=15;
      onlyWakeWhenDisturbed();
    }
  }


  private void dayCryer()
  {
    Util.clearConsole();
    System.out.println(StringConstants.CRY_DURING_DAY_SCENARIO);
    System.out.println("1. \t" + StringConstants.CRY_DURING_DAY_OPT1);
    System.out.println("2. \t" + StringConstants.CRY_DURING_DAY_OPT2);
    System.out.println("3. \t" + StringConstants.CRY_DURING_DAY_OPT3);
    System.out.println("4. \t" + StringConstants.CRY_DURING_DAY_OPT4);
    int choice = Util.enterInt(1,4);

    if (choice == 1)
    {
      
      creditPoints+=15;
      needFidgetToy();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      needTelevision();
    }
    else if (choice == 3)
    {
      
      creditPoints+=10;
      needDaycare();
    }
    else if (choice == 4)
    {
      
      creditPoints+=10;
      needMilk();
    }
  }
    
  private void nightCryer()
  {
    Util.clearConsole();
    System.out.println(StringConstants.CRY_DURING_NIGHT_SCENARIO);
    System.out.println("1. \t" + StringConstants.CRY_DURING_NIGHT_OPT1);
    System.out.println("2. \t" + StringConstants.CRY_DURING_NIGHT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      needMilk();
    }
    else if (choice == 2)
    {
      
      creditPoints+=15;
      learnEmotionalManipulation();
    }
  }
    
  private void needFidgetToy()
  {
    Util.clearConsole();
    System.out.println(StringConstants.NEED_FIDGET_TOY_SCENARIO);
    System.out.println("1. \t" + StringConstants.NEED_FIDGET_TOY_OPT1);
    System.out.println("2. \t" + StringConstants.NEED_FIDGET_TOY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=5;
      angerIssue();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      preOcd();
    }
  }

  private void needDaycare()
  {
    Util.clearConsole();
    System.out.println(StringConstants.NEED_DAYCARE_SCENARIO);
    System.out.println("1. \t" + StringConstants.NEED_DAYCARE_OPT1);
    System.out.println("2. \t" + StringConstants.NEED_DAYCARE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=5;
      untrustworthy();
    }
    else if (choice == 2)
    {
      
      creditPoints+=0;
      compliant();
    }
  }

  private void needTelevision()
  {
    Util.clearConsole();
    System.out.println(StringConstants.NEED_TV_SCENARIO);
    System.out.println("1. \t" + StringConstants.NEED_TV_OPT1);
    System.out.println("2. \t" + StringConstants.NEED_TV_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      darkHumor();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      imaginaryFriends();
    }
  }

  private void needMilk()
  {
    Util.clearConsole();
    System.out.println(StringConstants.NEED_MILK_SCENARIO);
    System.out.println("1. \t" + StringConstants.NEED_MILK_OPT1);
    System.out.println("2. \t" + StringConstants.NEED_MILK_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      drinkAllMilk();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      wantBuildingToys();
    }
  }

  private void listenClosely()
  {
    Util.clearConsole();
    System.out.println(StringConstants.LISTEN_CLOSELY_TO_CONVOS_SCENARIO);
    System.out.println("1. \t" + StringConstants.LISTEN_CLOSELY_TO_CONVOS_OPT1);
    System.out.println("2. \t" + StringConstants.LISTEN_CLOSELY_TO_CONVOS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=25;
      learnEmotionalManipulation();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      learnToTalkQuick();
    }
  }

  private void wandersOff()
  {
    Util.clearConsole();
    System.out.println(StringConstants.WANDER_OFF_IN_OWN_WORLD_SCENARIO);
    System.out.println("1. \t" + StringConstants.WANDER_OFF_IN_OWN_WORLD_OPT1);
    System.out.println("2. \t" + StringConstants.WANDER_OFF_IN_OWN_WORLD_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=15;
      senseOfLocation();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      wantBuildingToys();
    }
  }

  private void learnEmotionalManipulation()
  {
    Util.clearConsole();
    System.out.println(StringConstants.LEARN_EMOTIONAL_MANIPULATION_SCEANRIO);
    System.out.println("1. \t" + StringConstants.LEARN_EMOTIONAL_MANIPULATION_OPT1);
    System.out.println("2. \t" + StringConstants.LEARN_EMOTIONAL_MANIPULATION_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=15;
      saveAbilityForLater();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      wantBuildingToys();
    }
  }

  private void learnToTalkQuick()
  {
    Util.clearConsole();
    System.out.println(StringConstants.LEARN_TALKING_QUICKLY_SCENARIO);
    System.out.println("1. \t" + StringConstants.LEARN_TALKING_QUICKLY_OPT1);
    System.out.println("2. \t" + StringConstants.LEARN_TALKING_QUICKLY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      school();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      learnSwearWords();
    }
  }

  private void senseOfLocation()
  {
    Util.clearConsole();
    System.out.println(StringConstants.SENSE_OF_LOCATION_SCENARIO);
    System.out.println("1. \t" + StringConstants.SENSE_OF_LOCATION_OPT1);
    System.out.println("2. \t" + StringConstants.SENSE_OF_LOCATION_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=5;
      untrustworthy();
    }
    else if (choice == 2)
    {
      
      creditPoints+=15;
      photogenicMemory();
    }
  }

  private void onlyWakeAtMealTime()
  {
    Util.clearConsole();
    System.out.println(StringConstants.ONLY_WAKE_AT_MEALTIME_SCENARIO);
    System.out.println("1. \t" + StringConstants.ONLY_WAKE_AT_MEALTIME_OPT1);
    System.out.println("2. \t" + StringConstants.ONLY_WAKE_AT_MEALTIME_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      drinkAllMilk();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      wantBuildingToys();
    }
  }

  private void onlyWakeWhenDisturbed()
  {
    Util.clearConsole();
    System.out.println(StringConstants.ONLY_WAKE_WHEN_DISTURED_SCENARIO);
    System.out.println("1. \t" + StringConstants.ONLY_WAKE_WHEN_DISTURED_OPT1);
    System.out.println("2. \t" + StringConstants.ONLY_WAKE_WHEN_DISTURED_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      wandersOff();
    }
    else if (choice == 2)
    {
      
      creditPoints+=5;
      scratchAndBite();
    }
  }

  private void drinkAllMilk()
  {
    Util.clearConsole();
    System.out.println(StringConstants.DRINKS_ALL_MILK_SCENARIO);
    System.out.println("1. \t" + StringConstants.DRINKS_ALL_MILK_OPT1);
    System.out.println("2. \t" + StringConstants.DRINKS_ALL_MILK_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      wantBuildingToys();
    }
    else if (choice == 2)
    {
      
      creditPoints+=0;
      lactoseIntolerant();
    }
  }

  private void scratchAndBite()
  {
    Util.clearConsole();

    System.out.println(StringConstants.SCRATCHES_AND_BITES_SCENARIO);
    System.out.println("1. \t" + StringConstants.SCRATCHES_AND_BITES_OPT1);
    System.out.println("2. \t" + StringConstants.SCRATCHES_AND_BITES_OPT2);

    Util.pauseConsole();

    int randomInt1or2 = (int) (1+Math.random()*2);

    if (randomInt1or2 == 1)
    {
      
      creditPoints+=10;
      strongFamilyBond();
    }
    else if (randomInt1or2 == 2)
    {
      
      creditPoints+=5;
      behavioralIssue();
    }
  }

  private void angerIssue()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HAS_ANGER_ISSUE_SCENARIO);
    System.out.println("1. \t" + StringConstants.HAS_ANGER_ISSUE_OPT1);
    System.out.println("2. \t" + StringConstants.HAS_ANGER_ISSUE_OPT2);

    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      regularlyPunished();
    }
    else if (choice == 2)
    {
      gameOverRager();
    }
  }

  private void regularlyPunished()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_REGULARLY_PUNISHED_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_REGULARLY_PUNISHED_OPT1);
    System.out.println("2. \t" + StringConstants.IS_REGULARLY_PUNISHED_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      forcedIntoFamilyBusiness();
    }
    else if (choice == 2)
    {
      gameOverRager();
    }
  }

  private void gameOverRager()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_RAGER_SCENARIO);
    System.out.println("Credit points: " + creditPoints);
    Util.pauseConsole();
    System.out.println("Number of lives left:"+ numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void preOcd()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HAS_DEVELOPED_PREOCD_SCENARIO);
    System.out.println("1. \t" + StringConstants.HAS_DEVELOPED_PREOCD_OPT1);
    System.out.println("2. \t" + StringConstants.HAS_DEVELOPED_PREOCD_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=15;
      perfectionist();
    }
    else if (choice == 2)
    {
      
      creditPoints-=10;
      hated();
    }
  }

  private void perfectionist()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_PERFECTIONIST_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_PERFECTIONIST_OPT1);
    System.out.println("2. \t" + StringConstants.IS_PERFECTIONIST_OPT2);
    int randomInt1or2 = (int) (1+Math.random()*2);

    if (randomInt1or2 == 1)
    {
      
      creditPoints+=20;
      productivePerfectionist();
    }
    else if (randomInt1or2 == 2)
    {
      
      creditPoints-=10;
      hated();
    }
  }

  private void productivePerfectionist()
  {
    Util.clearConsole();

    System.out.println(StringConstants.OBSESSED_ON_ONE_PARTICULAR_THING_SCENARIO);
    System.out.println("1. \t" + StringConstants.OBSESSED_ON_ONE_PARTICULAR_THING_OPT1);
    System.out.println("2. \t" + StringConstants.OBSESSED_ON_ONE_PARTICULAR_THING_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      school();
    }
    else if (choice == 2)
    {
      
      creditPoints+=15;
      sports();
    }
  }

  private void imaginaryFriends()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HAS_IMAGINARY_FRIEND_SCENARIO);
    System.out.println("1. \t" + StringConstants.HAS_IMAGINARY_FRIEND_OPT1);
    System.out.println("2. \t" + StringConstants.HAS_IMAGINARY_FRIEND_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverUnconfident();
    }
    else if (choice == 2)
    {
      
      creditPoints+=50;
      matured();
    }
  }

  private void gameOverUnconfident()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_UNCONFIDENT_SCENARIO);
    System.out.println("Credit points: " + creditPoints);
    

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void darkHumor()
  {
    Util.clearConsole();

    System.out.println(StringConstants.LIKES_DARK_HUMOR_SCENARIO);
    System.out.println("1. \t" + StringConstants.LIKES_DARK_HUMOR_OPT1);
    System.out.println("2. \t" + StringConstants.LIKES_DARK_HUMOR_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      matured();
    }
    else if (choice == 2)
    {
      
      creditPoints-=10;
      hated();
    }
  }

  private void compliant()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_COMPLIANT_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_COMPLIANT_OPT1);
    System.out.println("2. \t" + StringConstants.IS_COMPLIANT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverUnconfident();
    }
    else if (choice == 2)
    {
      
      creditPoints+=20;
      standUp();
    }
  }

  private void standUp()
  {
    Util.clearConsole();

    System.out.println(StringConstants.STANDS_UP_FOR_THEMSELF_SCENARIO);
    System.out.println("1. \t" + StringConstants.STANDS_UP_FOR_THEMSELF_OPT1);
    System.out.println("2. \t" + StringConstants.STANDS_UP_FOR_THEMSELF_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=20;
      clever();
    }
    else if (choice == 2)
    {
      
      creditPoints-=10;
      hated();
    }
  }

  private void lactoseIntolerant()
  {
    Util.clearConsole();

    System.out.println(StringConstants.LACTOSE_INTOLERANT_SCENARIO);
    System.out.println("1. \t" + StringConstants.LACTOSE_INTOLERANT_OPT1);
    System.out.println("2. \t" + StringConstants.LACTOSE_INTOLERANT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
  }

  private void wantBuildingToys()
  {
    Util.clearConsole();

    System.out.println(StringConstants.WANTS_BUILDING_TOYS_SCENARIO);
    System.out.println("1. \t" + StringConstants.WANTS_BUILDING_TOYS_OPT1);
    System.out.println("2. \t" + StringConstants.WANTS_BUILDING_TOYS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=15;
      getWhateverYouWant();
    }
    else if (choice == 2)
    {
      
      creditPoints+=40;
      benefitsAll();
    }
  }

  private void buildsRobots()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BUILDS_ROBOTS_SCENARIO);
    System.out.println("1. \t" + StringConstants.BUILDS_ROBOTS_OPT1);
    System.out.println("2. \t" + StringConstants.BUILDS_ROBOTS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=40;
      benefitsAll();
    }
    else if (choice == 2)
    {
      
      creditPoints-=50;
      broke();
    }
  }

  private void benefitsAll()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BENEFITS_ALL_SCENARIO);
    System.out.println("1. \t" + StringConstants.BENEFITS_ALL_OPT1);
    System.out.println("2. \t" + StringConstants.BENEFITS_ALL_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=30;
      berkeleyEngineeringRobotics();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      invest();
    }
  }

  private void invest()
  {
    Util.clearConsole();

    System.out.println(StringConstants.INVESTS_SCENARIO);
    System.out.println("1. \t" + StringConstants.INVESTS_OPT1);
    System.out.println("2. \t" + StringConstants.INVESTS_OPT2);
    System.out.println("3. \t" + StringConstants.INVESTS_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      
      creditPoints+=40;
      useRobotsToInvest();
    }
    else if (choice == 2 && creditPoints <=100)
    {
      gameOverBadDecision1();
    }
    else if (choice == 2 && creditPoints >100)
    {
      creditPoints+=70;
      success1();
    }
    else if (choice ==3)
    {
      
      creditPoints+=30;
      sellRobotsThenInvest();
    }
  }

  private void saveAbilityForLater()
  {
    Util.clearConsole();

    System.out.println(StringConstants.SAVES_MANIPULATION_ABILITY_FOR_LATER_SCENARIO);
    System.out.println("1. \t" + StringConstants.SAVES_MANIPULATION_ABILITY_FOR_LATER_OPT1);
    System.out.println("2. \t" + StringConstants.SAVES_MANIPULATION_ABILITY_FOR_LATER_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=20;
      getWhateverYouWant();
    }
  }

  private void getWhateverYouWant()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_WHATEVER_THEY_WANT_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_WHATEVER_THEY_WANT_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_WHATEVER_THEY_WANT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
  }

  private void learnSwearWords()
  {
    Util.clearConsole();

    System.out.println(StringConstants.LEARNS_SWEAR_WORDS_SCENARIO);
    System.out.println("1. \t" + StringConstants.LEARNS_SWEAR_WORDS_OPT1);
    System.out.println("2. \t" + StringConstants.LEARNS_SWEAR_WORDS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      matured();
    }
    else if (choice == 2)
    {
      
      creditPoints-=50;
      hated();
    }
  }

  private void untrustworthy()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_UNTRUSTWORTHY_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_UNTRUSTWORTHY_OPT1);
    System.out.println("2. \t" + StringConstants.IS_UNTRUSTWORTHY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      getsJob();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      broke();
    }
  }

  private void getsJob()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_JOB_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=30;
      unemployed();
    }
    else if (choice == 2)
    {
      
      creditPoints+=60;
      promotion();
    }
  }
    
  private void photogenicMemory()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HAS_PHOTOGENIC_MEMORY_SCENARIO);
    System.out.println("1. \t" + StringConstants.HAS_PHOTOGENIC_MEMORY_OPT1);
    System.out.println("2. \t" + StringConstants.HAS_PHOTOGENIC_MEMORY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=40;
      hated();
    }
    else if (choice == 2)
    {
      
      creditPoints+=50;
      beHelpful();
    }
  }

  private void beHelpful()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_HELPFUL_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_HELPFUL_OPT1);
    System.out.println("2. \t" + StringConstants.IS_HELPFUL_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=40;
      helpFindLostWallet();
    }
  }

  private void helpFindLostWallet()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HELPS_FIND_LOST_WALLET_SCENARIO);
    System.out.println("1. \t" + StringConstants.HELPS_FIND_LOST_WALLET_OPT1);
    System.out.println("2. \t" + StringConstants.HELPS_FIND_LOST_WALLET_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      guiltForever();
      
    }
    else if (choice == 2)
    {
      
      creditPoints+=50;
      trusted();
    }
  }

  private void behavioralIssue()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BEHAVIORAL_ISSUE_SCENARIO);
    System.out.println("1. \t" + StringConstants.BEHAVIORAL_ISSUE_OPT1);
    System.out.println("2. \t" + StringConstants.BEHAVIORAL_ISSUE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      fixIssue();
    }
    else if (choice == 2 && creditPoints <=180)
    {
      gameOverBadDecision1();
    }
    else if (choice == 2 && creditPoints >180)
    {
      fixIssue();
    }
    
  }

  private void fixIssue()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_FIX_ISSUE_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_FIX_ISSUE_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_FIX_ISSUE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=70;
      matured();
    }
    else if (choice == 2 && creditPoints <=200)
    {
      gameOverBadDecision1();
    }
    else if (choice == 2 && creditPoints >200)
    {
      matured();
    }
  }

  private void strongFamilyBond()
  {
    Util.clearConsole();

    System.out.println(StringConstants.STRONG_FAMILY_BOND_SCENARIO);
    System.out.println("1. \t" + StringConstants.STRONG_FAMILY_BOND_OPT1);
    System.out.println("2. \t" + StringConstants.STRONG_FAMILY_BOND_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverUnconfident();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      hateFamilyLater();
    }
  }

  private void hateFamilyLater()
  {
    Util.clearConsole();

    System.out.println(StringConstants.HATES_FAMILY_IN_FUTURE_SCENARIO);
    System.out.println("1. \t" + StringConstants.HATES_FAMILY_IN_FUTURE_OPT1);
    System.out.println("2. \t" + StringConstants.HATES_FAMILY_IN_FUTURE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=15;
      reconcile();
    }
    else if (choice == 2)
    {
      unemployed();
      creditPoints-=20;
    }
  }

  private void reconcile()
  {
    Util.clearConsole();

    System.out.println(StringConstants.RECONCILES_WITH_FAMILY_SCENARIO);
    System.out.println("1. \t" + StringConstants.RECONCILES_WITH_FAMILY_OPT1);
    System.out.println("2. \t" + StringConstants.RECONCILES_WITH_FAMILY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      matured();
    }
    else if (choice == 2)
    {
      unemployed();
      creditPoints-=20;
    }
  }

  private void forcedIntoFamilyBusiness()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_FORCED_INTO_FAMILY_BUSINESS_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_FORCED_INTO_FAMILY_BUSINESS_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_FORCED_INTO_FAMILY_BUSINESS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints <=250)
    {
      gameOverBadDecision1();
    }
    else if (choice == 1 && creditPoints >250)
    {
      success1();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      escapes();
    }
  }

  private void escapes()
  {
    Util.clearConsole();

    System.out.println(StringConstants.ESCAPES_FAMILY_BUSINESS_SCENARIO);
    System.out.println("1. \t" + StringConstants.ESCAPES_FAMILY_BUSINESS_OPT1);
    System.out.println("2. \t" + StringConstants.ESCAPES_FAMILY_BUSINESS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=60;
      startOwnBusiness();
    }
  }

  private void startOwnBusiness()
  {
    Util.clearConsole();

    System.out.println(StringConstants.STARTS_OWN_BUSINESS_SCENARIO);
    System.out.println("1. \t" + StringConstants.STARTS_OWN_BUSINESS_OPT1);
    System.out.println("2. \t" + StringConstants.STARTS_OWN_BUSINESS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void sports()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BECOMES_ATHLETE_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_ATHLETE_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_ATHLETE_OPT2);
    System.out.println("3. \t" + StringConstants.BECOMES_ATHLETE_OPT3);
    System.out.println("4. \t" + StringConstants.BECOMES_ATHLETE_OPT4);
    System.out.println("5. \t" + StringConstants.BECOMES_ATHLETE_OPT5);
    int choice = Util.enterInt(1,5);
/*
    if (choice == 5)
    {
    final String PROMPT_ENTER_SPORT_5 = "What sport do you play: ";
    System.out.print(PROMPT_ENTER_SPORT_5);
    String sport = scan.nextLine();
      
    }
    */
    Util.pauseConsole();

    if (choice == 1)
    {
      gameOverBrokenSkull();
    }
    else if (choice == 2 || choice == 3)
    {
      
      creditPoints+=100;
      success1();
    }
    else if (choice == 4 || choice == 5)
    {
      
      creditPoints+=10;
      basketballAndOther();
    }
  }

  private void basketballAndOther()
  {
    Util.clearConsole();

    System.out.println(StringConstants.PLAYS_BASKETBALL_OR_OTHER_SCENARIO);
    System.out.println("1. \t" + StringConstants.PLAYS_BASKETBALL_OR_OTHER_OPT1);
    System.out.println("2. \t" + StringConstants.PLAYS_BASKETBALL_OR_OTHER_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      injuryProne();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      injuryFree();
    }
  }

  private void injuryFree()
  {
    Util.clearConsole();

    System.out.println(StringConstants.STAYS_INJURY_FREE_SCENARIO);
    System.out.println("1. \t" + StringConstants.STAYS_INJURY_FREE_OPT1);
    System.out.println("2. \t" + StringConstants.STAYS_INJURY_FREE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=35;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void injuryProne()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BECOMES_INJURY_PRONE_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_INJURY_PRONE_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_INJURY_PRONE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints<=250)
    {
      gameOverGaveUp();
    }
    else if (choice == 1 && creditPoints >250)
    {
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void berkeleyEngineeringRobotics()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_ACCEPTED_TO_BERKELEY_ENGINEERING_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_ACCEPTED_TO_BERKELEY_ENGINEERING_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_ACCEPTED_TO_BERKELEY_ENGINEERING_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      getDegree();
    }
  }

  private void getDegree()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_BERKELEY_DEGREE_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_BERKELEY_DEGREE_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_BERKELEY_DEGREE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=100;
      success1();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      useRobotsToInvest();
      
    }
  }

  private void school()
  {
    Util.clearConsole();

    System.out.println(StringConstants.FOCUSES_ON_STUDIES_SCENARIO);
    System.out.println("1. \t" + StringConstants.FOCUSES_ON_STUDIES_OPT1);
    System.out.println("2. \t" + StringConstants.FOCUSES_ON_STUDIES_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=20;
      berkeleyEngineeringRobotics();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      goodWriter();
      
    }
  }

  private void goodWriter()
  {
    Util.clearConsole();

    System.out.println(StringConstants.FOCUSES_ON_STUDIES_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_GOOD_WRITER_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_GOOD_WRITER_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints <=320)
    {
      gameOverBadDecision2();
      
    }
    else if (choice == 1 && creditPoints >320)
    {
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void hated()
  {
    Util.clearConsole();

    System.out.println(StringConstants.FOCUSES_ON_STUDIES_SCENARIO);
    System.out.println("1. \t" + StringConstants.FOCUSES_ON_STUDIES_OPT1);
    System.out.println("2. \t" + StringConstants.FOCUSES_ON_STUDIES_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints<=360)
    {
      gameOverGaveUp();
    }
    else if (choice == 1 && creditPoints >360)
    {
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      beginVillainArk();
      
    }
  }

  private void beginVillainArk()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_BEING_VILLIAN_ARK_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_BEING_VILLIAN_ARK_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_BEING_VILLIAN_ARK_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=30;
      getGoodJob();
      
    }
    else if (choice == 2)
    {
      
      creditPoints+=20;
      shadyBusiness();
    }
  }

  private void shadyBusiness()
  {
    Util.clearConsole();

    System.out.println(StringConstants.MAKES_MONEY_WITH_SHADY_BUSINESS_SCENARIO);
    System.out.println("1. \t" + StringConstants.MAKES_MONEY_WITH_SHADY_BUSINESS_OPT1);
    System.out.println("2. \t" + StringConstants.MAKES_MONEY_WITH_SHADY_BUSINESS_OPT2);
    System.out.println("3. \t" + StringConstants.MAKES_MONEY_WITH_SHADY_BUSINESS_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      gameOverSelfish();
    }
    else if (choice == 2)
    {
      happy();
      
    }
    else if (choice == 3)
    {
      
      creditPoints+=40;
      useRobotsToInvest();
    }
  }

   private void getGoodJob()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_VERY_GOOD_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_VERY_GOOD_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_VERY_GOOD_JOB_OPT2);
    System.out.println("3. \t" + StringConstants.GETS_VERY_GOOD_JOB_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      gameOverSelfish();
    }
    else if (choice == 2)
    {
      happy();
    }
    else if (choice == 3)
    {
      creditPoints+=50;
      useRobotsToInvest();
    }
  }

  private void matured()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BECOMES_MATURED_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_MATURED_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_MATURED_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      laxedParent();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      strictParent();
    }
  }

  private void laxedParent()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_A_LAID_BACK_PARENT_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_A_LAID_BACK_PARENT_OPT1);
    System.out.println("2. \t" + StringConstants.IS_A_LAID_BACK_PARENT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverBadDecision2();
    }
    else if (choice == 2)
    {
      happy();
    }
  }

  private void strictParent()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_A_STRICT_PARENT_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_A_STRICT_PARENT_OPT1);
    System.out.println("2. \t" + StringConstants.IS_A_STRICT_PARENT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints <=360)
    {
      gameOverBadDecision3();
    }
    else if (choice ==1 && creditPoints >360)
    {
      trusted();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      childAthletic();
      
    }
  }

  private void childAthletic()
  {
    Util.clearConsole();

    System.out.println(StringConstants.CHILD_BECOMES_PROFESSIONAL_ATHLETE_SCENARIO);
    System.out.println("1. \t" + StringConstants.CHILD_BECOMES_PROFESSIONAL_ATHLETE_OPT1);
    System.out.println("2. \t" + StringConstants.CHILD_BECOMES_PROFESSIONAL_ATHLETE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1 && creditPoints <=360)
    {
      gameOverBadDecision3();
    }
    else if (choice ==1 && creditPoints >360)
    {
      trusted();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success100();
      
    }
  }

  private void sellRobotsThenInvest()
  {
    Util.clearConsole();

    System.out.println(StringConstants.SELLS_ROBOTS_THEN_INVESTS_SCENARIO);
    System.out.println("1. \t" + StringConstants.SELLS_ROBOTS_THEN_INVESTS_OPT1);
    System.out.println("2. \t" + StringConstants.SELLS_ROBOTS_THEN_INVESTS_OPT2);
    System.out.println("3. \t" + StringConstants.SELLS_ROBOTS_THEN_INVESTS_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      
      creditPoints+=10;
      investBigCompanies();
      
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      investIndexFunds();
      
    }
    else if (choice == 3)
    {
      gameOverAddiction();
      
    }
  }

  private void investBigCompanies()
  {
    Util.clearConsole();

    System.out.println(StringConstants.INVESTS_ONLY_IN_BIG_COMPANIES_SCENARIO);
    System.out.println("1. \t" + StringConstants.INVESTS_ONLY_IN_BIG_COMPANIES_OPT1);
    System.out.println("2. \t" + StringConstants.INVESTS_ONLY_IN_BIG_COMPANIES_OPT2);
    System.out.println("3. \t" + StringConstants.INVESTS_ONLY_IN_BIG_COMPANIES_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      
      creditPoints+=100;
      success1();
      
    }
    else if (choice == 2||choice == 3)
    {
      gameOverAddiction();
    }
    
  }

  private void investIndexFunds()
  {
    Util.clearConsole();

    System.out.println(StringConstants.INVESTS_ONLY_IN_INDEX_FUNDS_SCENARIO);
    System.out.println("1. \t" + StringConstants.INVESTS_ONLY_IN_INDEX_FUNDS_OPT1);
    System.out.println("2. \t" + StringConstants.INVESTS_ONLY_IN_INDEX_FUNDS_OPT2);
    System.out.println("3. \t" + StringConstants.INVESTS_ONLY_IN_INDEX_FUNDS_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      
      creditPoints+=100;
      success1();
      
    }
    else if (choice == 2||choice == 3)
    {
      gameOverAddiction();
    }
  }
  
  private void useRobotsToInvest()
  {
    Util.clearConsole();

    System.out.println(StringConstants.USES_ROBOTS_TO_INVEST_SCENARIO);
    System.out.println("1. \t" + StringConstants.USES_ROBOTS_TO_INVEST_OPT1);
    System.out.println("2. \t" + StringConstants.USES_ROBOTS_TO_INVEST_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      trackRobotInvestments();
      
    }
    else if (choice == 2)
    {
      gameOverBadDecision2();
    }
  }

  private void trackRobotInvestments()
  {
    Util.clearConsole();

    System.out.println(StringConstants.TRACKS_ROBOT_INVESTMENTS_SCENARIO);
    System.out.println("1. \t" + StringConstants.TRACKS_ROBOT_INVESTMENTS_OPT1);
    System.out.println("2. \t" + StringConstants.TRACKS_ROBOT_INVESTMENTS_OPT2);
    Util.pauseConsole();
    int randomInt1or2 = (int) (1+Math.random()*2);

    if (randomInt1or2 == 1)
    {
      
      creditPoints+=100;
      success1();
    }
    else if (randomInt1or2 == 2)
    {
      gameOverBadDecision2();
    }
  }

  private void initialSuccess()
  {
    Util.clearConsole();

    System.out.println(StringConstants.ACHIEVES_INITIAL_SUCCESS_IN_EARLY_YEARS_SCENARIO);
    System.out.println("1. \t" + StringConstants.ACHIEVES_INITIAL_SUCCESS_IN_EARLY_YEARS_OPT1);
    System.out.println("2. \t" + StringConstants.ACHIEVES_INITIAL_SUCCESS_IN_EARLY_YEARS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverUnconfident();
    }
    else if (choice == 2)
    {
      
      creditPoints+=50;
      buildAiRobot();
    }
  }

  private void buildAiRobot()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_BUILD_AI_ROBOT_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_BUILD_AI_ROBOT_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_BUILD_AI_ROBOT_OPT2);
    System.out.println("3. \t" + StringConstants.DECIDES_TO_BUILD_AI_ROBOT_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1 && creditPoints <=320)
    {
      gameOverBadDecision1();
    }
    else if (choice ==1 && creditPoints >320)
    {
      success1();
    }
    else if (choice == 2)
    {
      
      creditPoints+=50;
      useRobotsToInvest();
    }
    else if (choice == 3)
    {
      
      creditPoints+=20;
      sellRobotsThenInvest();
    }
  }

  private void broke()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BECOMES_BROKE_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_BROKE_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_BROKE_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      gameOverGaveUp();
    }
    else if (choice == 2)
    {
      
      creditPoints+=10;
      oneLastTry();
    }
  }

  private void oneLastTry()
  {
    Util.clearConsole();

    System.out.println(StringConstants.ONE_LAST_ATTEMPT_AT_SUCCESS_SCENARIO);
    System.out.println("1. \t" + StringConstants.ONE_LAST_ATTEMPT_AT_SUCCESS_OPT1);
    System.out.println("2. \t" + StringConstants.ONE_LAST_ATTEMPT_AT_SUCCESS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=30;
      invest();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void unemployed()
  {
    Util.clearConsole();

    System.out.println(StringConstants.BECOMES_UNEMPLOYED_SCENARIO);
    System.out.println("1. \t" + StringConstants.BECOMES_UNEMPLOYED_OPT1);
    System.out.println("2. \t" + StringConstants.BECOMES_UNEMPLOYED_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      takeWhateverJob();
    }
  }

  private void takeWhateverJob()
  {
    Util.clearConsole();

    System.out.println(StringConstants.TAKES_ANY_AVAILABLE_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.TAKES_ANY_AVAILABLE_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.TAKES_ANY_AVAILABLE_JOB_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      success100();
      
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      getSideHustle();
    }
  }

  private void getSideHustle()
  {
    Util.clearConsole();

    System.out.println(StringConstants.FINDS_SIDE_HUSTLE_ALONGSIDE_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.FINDS_SIDE_HUSTLE_ALONGSIDE_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.FINDS_SIDE_HUSTLE_ALONGSIDE_JOB_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      invest();
    }
  }

  private void promotion()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_A_PROMOTION_AT_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_A_PROMOTION_AT_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_A_PROMOTION_AT_JOB_OPT1);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      keepJob();
    }
  }

  private void keepJob()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_KEEP_CURRENT_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_KEEP_CURRENT_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_KEEP_CURRENT_JOB_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=20;
      tryToFindBetterJob();
    }
    else if (choice == 2)
    {
      failed();
    }
  }

  private void tryToFindBetterJob()
  {
    Util.clearConsole();

    System.out.println(StringConstants.LATER_CHANGES_MIND_TO_FIND_BETTER_JOB_SCENARIO);
    System.out.println("1. \t" + StringConstants.LATER_CHANGES_MIND_TO_FIND_BETTER_JOB_OPT1);
    System.out.println("2. \t" + StringConstants.LATER_CHANGES_MIND_TO_FIND_BETTER_JOB_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      success100();
    }
    else if (choice == 2)
    {
      
      creditPoints+=30;
      getSideHustle();
    }
  }

  private void trusted()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_TRUSTED_PERSON_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_TRUSTED_PERSON_OPT1);
    System.out.println("2. \t" + StringConstants.IS_TRUSTED_PERSON_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      matured();
    }
    else if (choice == 2 && creditPoints <=400)
    {
      failed();
    }
    else if (choice == 2 && creditPoints >400)
    {
      success1();
    }
  }

  private void clever()
  {
    Util.clearConsole();

    System.out.println(StringConstants.IS_CLEVER_SCENARIO);
    System.out.println("1. \t" + StringConstants.IS_CLEVER_OPT1);
    System.out.println("2. \t" + StringConstants.IS_CLEVER_OPT2);
    System.out.println("3. \t" + StringConstants.IS_CLEVER_OPT3);
    System.out.println("4. \t" + StringConstants.IS_CLEVER_OPT4);
    int choice = Util.enterInt(1,4);

    if (choice == 1)
    {
      
      creditPoints+=100;
      initialSuccess();
    }
    else if (choice == 2)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 3)
    {
      
      creditPoints+=30;
      findsJobEasily();
    }
    else if (choice == 4)
    {
     
      creditPoints+=30;
      manipulateOthers();
    }
  }

  private void findsJobEasily()
  {
    Util.clearConsole();

    System.out.println(StringConstants.FINDS_JOBS_EASILY_SCENARIO);
    System.out.println("1. \t" + StringConstants.FINDS_JOBS_EASILY_OPT1);
    System.out.println("2. \t" + StringConstants.FINDS_JOBS_EASILY_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      success100();
    }
    else if (choice == 2)
    {
      
      creditPoints-=30;
      complacent();
    }
  }
    
  private void complacent()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GETS_COMPLACENT_SCENARIO);
    System.out.println("1. \t" + StringConstants.GETS_COMPLACENT_OPT1);
    System.out.println("2. \t" + StringConstants.GETS_COMPLACENT_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1||choice == 2)
    {
      failed();
    }
  }

  private void manipulateOthers()
  {
    Util.clearConsole();

    System.out.println(StringConstants.MANIPULATES_OTHERS_SCENARIO);
    System.out.println("1. \t" + StringConstants.MANIPULATES_OTHERS_OPT1);
    System.out.println("2. \t" + StringConstants.MANIPULATES_OTHERS_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      failed();
    }
    else if (choice == 2)
    {
      
      creditPoints+=100;
      success1();
    }
  }

  private void success1()
  {
    Util.clearConsole();

    System.out.println(StringConstants.GREAT_SUCCESS_SO_FAR_SCENARIO);
    System.out.println("1. \t" + StringConstants.GREAT_SUCCESS_SO_FAR_OPT1);
    System.out.println("2. \t" + StringConstants.GREAT_SUCCESS_SO_FAR_OPT2);
    System.out.println("2. \t" + StringConstants.GREAT_SUCCESS_SO_FAR_OPT3);
    int choice = Util.enterInt(1,3);

    if (choice == 1)
    {
      happy();
    }
    else if (choice == 2)
    {
      
      creditPoints+=20;
      stayInCurrentSituation();
    }
    else if (choice == 3)
    {
      
      creditPoints+=30;
      achieveBiggerGoal();
    }
  }

  private void stayInCurrentSituation()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_STAY_IN_CURRENT_CIRCUMSTANCES_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_STAY_IN_CURRENT_CIRCUMSTANCES_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_STAY_IN_CURRENT_CIRCUMSTANCES_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=50;
      matured();
    }
    else if (choice == 2)
    {
      happy();
    }
  }

  private void achieveBiggerGoal()
  {
    Util.clearConsole();

    System.out.println(StringConstants.TRIES_TO_ACHIEVE_BIGGER_LIFE_GOAL_SCENARIO);
    System.out.println("1. \t" + StringConstants.TRIES_TO_ACHIEVE_BIGGER_LIFE_GOAL_OPT1);
    System.out.println("2. \t" + StringConstants.TRIES_TO_ACHIEVE_BIGGER_LIFE_GOAL_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints+=10;
      goProInGolf();
    }
    else if (choice == 2)
    {
      tryToBecomeBestSellingAuthor();
      creditPoints+=10;
    }
  }

  private void goProInGolf()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_TRY_TO_BECOME_PRO_GOLFER_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_TRY_TO_BECOME_PRO_GOLFER_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_TRY_TO_BECOME_PRO_GOLFER_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      success100();
    }
  }

  private void tryToBecomeBestSellingAuthor()
  {
    Util.clearConsole();

    System.out.println(StringConstants.DECIDES_TO_TRY_TO_BECOME_AUTHOR_SCENARIO);
    System.out.println("1. \t" + StringConstants.DECIDES_TO_TRY_TO_BECOME_AUTHOR_OPT1);
    System.out.println("2. \t" + StringConstants.DECIDES_TO_TRY_TO_BECOME_AUTHOR_OPT2);
    int choice = Util.enterInt(1,2);

    if (choice == 1)
    {
      
      creditPoints-=50;
      broke();
    }
    else if (choice == 2)
    {
      success100();
    }
  }

  private void gameOverBadDecision1()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_BAD_DECISION1_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverBadDecision2()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_BAD_DECISION2_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverBadDecision3()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_BAD_DECISION3_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverBrokenSkull()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_BROKEN_SKULL_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverGaveUp()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_GAVE_UP_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverSelfish()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_SELFISH_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void gameOverAddiction()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GAME_OVER_ADDICTION_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void guiltForever()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.GUILT_FOREVER_END_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void happy()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.HAPPY_END_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void success100()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.SUCCESS100_END_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  private void failed()
  {
    Util.clearConsole();

    numLives--;

    System.out.println(StringConstants.FAILED_END_SCENARIO);
    System.out.println("Credit Points: " + creditPoints);
    

    Util.pauseConsole();
    System.out.println("Number of lives left:" + numLives);
    Util.pauseConsole();

    if (numLives > 0)
    {
      start();
    }
    else
    {
      System.out.println("GAME OVER");
    }
  }

  
    
}