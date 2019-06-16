package com.totoliciionut.mylibrary;


import java.util.ArrayList;


public class Intstr_Pojo {

    public static final int GOAL =1111;
    public static final int GOOD_HABIT= 2222;
    public static final int BAD_HABIT = 3333;
    public static final int BAD_REMINDER =4444;
    public static final int GOOD_REMINDER = 5555;
    public static final int TIP =5555;

    private String string;
    private int anInt;
    private int type;

    public Intstr_Pojo(String string, int anInt, int type) {
        this.string = string;
        this.anInt = anInt;
        this.type = type;
    }


    public static ArrayList<Intstr_Pojo> getAllGoodHabits(){
        ArrayList<Intstr_Pojo> allGoodHabits= new ArrayList<>();

         for (int i = 1;i<=6;i++){
             allGoodHabits.add(new Intstr_Pojo(getGoodHabitName(i),i,GOOD_HABIT));
         }
         return allGoodHabits;

    }

    public static ArrayList<Intstr_Pojo> getAllBadHabits(){
        ArrayList<Intstr_Pojo> allBadHabits= new ArrayList<>();

        for (int i = 1;i<=11;i++){
            allBadHabits.add(new Intstr_Pojo(getBadHabitName(i),i,BAD_HABIT));
        }
        return allBadHabits;
    }
    public static ArrayList<String> getAllIntStringPojoNamesString(ArrayList<Intstr_Pojo> intstr_pojos){
        ArrayList<String> strings =new ArrayList<>();

        for (int i = 0; i< intstr_pojos.size(); i++){

            Intstr_Pojo intstr_pojo = (Intstr_Pojo) intstr_pojos.get(i);

            String string = intstr_pojo.getString();
            strings.add(string);
        }

        return strings;
    }

    public class Reminders {
        public static final int PUT_THE_CONTROLLER_IN_ANOTHER_ROOM_AFTER_YOURE_DONE_PLAYING =1 ;
        public static final int PUT_THE_REMOTE_BATTERIES_AND_CABLE_IN_DIFFERENT_ROOMS_OF_THE_TV= 2;
        public static final int AFTER_IM_DONE_READING_PUT_THE_BOOK_ON_AN_ACCESIBLE_TABLE= 3;
        public static final int AFTER_IM_DONE_PUT_THE_DRAWING_KIT_ON_AN_ACCESIBLE_TABLE= 4;
        public static final int AFTER_IM_DONE_EXERCISING_REMIND_ME_TO_PREPARE_MY_GYM_CLOTHES_FOR_THE_NEXT_TIME= 5;

    }





    public static class GetTips {
        public static String getTipsName(int tip, String substance){
            switch (tip){
                case 1:return "Stay busy(try a new hobby or an old one" +
                        ")(watch motivational content like 'Improvement pill' and 'Seth Alexander')";
                case 2: return "Make things official(write your goals" +
                        " on a piece of paper and stick it on a wall)(talk to your friends and family about your plans)";
                case 3:return "Being tired is one of the biggest reasons for relapsing so always be rested";
                case 4:return "Try listening to music while doing your habit to make everything more fun";
                case 5:return "Try to not have your phone near you when you go to bed";
                case 6:return "Try to do it without porn";
                case 7:return "Try blocking porn websites or even uninstall your browser if you don't use it much";
                case 8:return "Turn off all notifications";
                case 9:return "Try to leave your phone home as much as possible";
                case 10:return "Uninstall all your social media apps and access them only from the browser or your computer";
                case 11:return "Try using Bfree-Break phone addiction " +
                        "(it puts you to do math problems before opening social media apps)";
                case 12:return "Free your house of "+substance;
                case 13:return "Eat more fruits and shakes";
                case 14:return "Instead of bringing your pack of cigarettes to you, bring a bottle of water or a fruit";
                case 15:return "Eat healthy and exercise";
                case 19:return "Chew gum";
                case 16:return "Put all your games in a hard accessible folder";
                case 17:return "ONLY play one game at a time";
                case 18:return "Avoid mmo's";
                case 20:return "If the first thing that you see when you enter your house" +
                        " is a comfortable couch facing a big tv then change that, turn the" +
                        " couch the other way or have no couch";
                case 21:return "Drink lots of water and eat fruits";
                case 22:return "Realise that an almost win is a lose";
                case 23:return "Try to not have gambling centers in your way at all";
                case 24:return "Install book apps on your phone";
                case 25:return "Try to not have fast food or restaurants in your way at all";
                case 26:return "Never order junk food for home so when you want it you have to go to a restaurant";
                case 27:return "Try to get into cooking and never let your fridge be empty";
                case 28:return "Allow yourself to listen to music only when you're doing cold showers";
                case 29:return "Have your workout as your phone wallpaper";
            }
            return "";
        }

        public static ArrayList<Intstr_Pojo> getGoodHabitTips(int GoodHabit){
            ArrayList<Intstr_Pojo> tips = new ArrayList<>();

            switch (GoodHabit){
                case GoodHabbits.COLD_SHOWERS : tips.add
                        (newTip(Tips.ALLOW_YOURSELF_TO_LISTEN_TO_MUSIC_ONLY_WHEN_YOU_ARE_DOING_COLD_SHOWERS,
                                ""));break;

                case GoodHabbits.DRAWING : tips.add(newTip(Tips.LISTEN_TO_MUSIC_WHILE,"drawing"));break;

                case GoodHabbits.EXERCISE : tips.add(newTip(Tips.HAVE_YOUR_WORKOUT_PLAN_AS_YOUR_PHONE_WALLPAPER,"")); break;

                case GoodHabbits.GO_FOR_A_RUN_WALK : break;

                case GoodHabbits.MEDITATION : break;

                case GoodHabbits.READING : tips.add(newTip(Tips.INSTALL_BOOK_APPS_ON_YOUR_PHONE,""));break;
            }
            tips.add(newTip(Tips.MAKE_THINGS_OFFICIAL,""));
            return tips;
        }

        public static ArrayList<Intstr_Pojo> getBadHabitTips(int BadHabit){
            ArrayList<Intstr_Pojo> tips = new ArrayList<>();
            switch (BadHabit){
                case BadHabbits.ALCOHOL :tips.add(newTip(Tips.FREE_YOUR_HOUSE_OF_THEM,"alcohol"));
                tips.add(newTip(Tips.DRINK_LOTS_OF_WATER_AND_FRUITS,"alcohol"));break;

                case BadHabbits.DRUGS :tips.add(newTip(Tips.DRINK_LOTS_OF_WATER_AND_FRUITS,""));break;

                case BadHabbits.GAMBLING :tips.add(newTip(Tips.REALISE_THAT_AN_ALMOST_WIN_IS_A_LOSE,""));
                tips.add(newTip(Tips.TRY_TO_NOT_HAVE_GAMBLING_CENTERS_IN_YOUR_WAY_AT_ALL,""));break;

                case BadHabbits.GAMING :tips.add(newTip(Tips.HAVE_YOUR_GAMES_IN_A_HARD_ACCESIBLE_FOLDER,""));
                    tips.add(newTip(Tips.ONLY_PLAY_ONE_GAME_AT_A_TIME,""));
                    tips.add(newTip(Tips.AVOID_MMOS,""));break;

                case BadHabbits.JUNK_FOOD:tips.add(newTip(Tips.EAT_HEALTHY_AND_EXERCISE,""));
                    tips.add(newTip(Tips.TRY_TO_NOT_HAVE_JUNK_FOOD_OR_RESTAURANTS_IN_YOUR_WAY_AT_ALL,""));
                    tips.add(newTip(Tips.
                            NEVER_EAT_JUNK_FOOD_AT_HOME_INSTEAD_GO_TO_A_RESTAURANT_IF_YOU_REALLY_CANT_RESIST,
                            ""));
                    tips.add(newTip(Tips.
                            TRY_GETTING_INTO_COOKING_AND_START_MAKING_YOUR_MEALS_AT_HOME_AND_NEVER_HAVE_YOUR_FRIDGE_EMPTY,
                            ""));break;
                case BadHabbits.OTHER_SUBSTANCES:tips.add(newTip(Tips.EAT_HEALTHY_AND_EXERCISE,""));
                break;

                case BadHabbits.PORN:tips.add(newTip(Tips.DONT_HAVE_YOUR_PHONE_NEAR_YOU_WHEN_YOU_SLEEP,""));
                    tips.add(newTip(Tips.AT_LEAST_DO_IT_WITHOUT_PORN,""));
                    tips.add(newTip(Tips.TRY_BLOCKING_PORN_WEBSITES_OR_EVEN_UNINSTALL_YOUR_BROWSER_IF_YOU_CAN,""));
                    break;

                case BadHabbits.SMOKING:tips.add(newTip(Tips.DRINK_LOTS_OF_WATER_AND_FRUITS,""));
                    tips.add(newTip(Tips.
                            INSTEAD_OF_BRINGING_YOUR_PACK_OF_CIGGARETES_TO_YOU_BRING_A_BOTTLE_OF_WATER_OR_A_FRUIT,
                            ""));break;

                case BadHabbits.SOCIAL_MEDIA:tips.add(newTip(Tips.TRY_TO_LEAVE_YOUR_PHONE_HOME_AS_MUCH_AS_POSSIBLE
                        ,""));
                tips.add(newTip(Tips.DONT_HAVE_YOUR_PHONE_NEAR_YOU_WHEN_YOU_SLEEP,""));
                tips.add(newTip(Tips.TURN_OFF_NOTIFICATIONS,""));
                    tips.add(newTip(Tips.UNINSTALL_ALL_THE_SOCIAL_MEDIA_APPS_AND_ACCES_THEM_FROM_A_BROWSER_OR_COMPUTER
                            ,""));
                    tips.add(newTip(Tips.USE_BFREE_BREAK_PHONE_ADDICTION,""));break;

                case BadHabbits.SUGAR:tips.add(newTip(Tips.DRINK_LOTS_OF_WATER_AND_FRUITS,""));
                break;

                case BadHabbits.TV:tips.add(newTip(Tips.IF_THE_FIRST_THING_WHEN_YOU_ENTER_YOUR_HOUSE_IS_A_COMFORTABLE_COUCH_AND_A_BIG_TV_IN_FRONT_OF_IT_THEN_CHANGE_THAT,
                        ""));break;

            }
            tips.add(newTip(Tips.STAY_BUSY_A_HOBBY_IS_GREAT_WATCH_MOTIVATIONAL_CONTENT,""));
            tips.add(newTip(Tips.MAKE_THINGS_OFFICIAL,""));
            tips.add(newTip(Tips.BE_RESTED,""));

            return tips;
        }

        public static Intstr_Pojo newTip(int Tip,String substance){
            return new Intstr_Pojo(getTipsName(Tip,substance),Tip,TIP);
        }
    }
    public class Tips{
        static final int STAY_BUSY_A_HOBBY_IS_GREAT_WATCH_MOTIVATIONAL_CONTENT = 1;
        static final int MAKE_THINGS_OFFICIAL =2;
        static final int BE_RESTED = 3;
        static final int LISTEN_TO_MUSIC_WHILE = 4;

        static final int DONT_HAVE_YOUR_PHONE_NEAR_YOU_WHEN_YOU_SLEEP =5;
        static final int AT_LEAST_DO_IT_WITHOUT_PORN = 6;
        static final int TRY_BLOCKING_PORN_WEBSITES_OR_EVEN_UNINSTALL_YOUR_BROWSER_IF_YOU_CAN =7;

        static final int TURN_OFF_NOTIFICATIONS= 8;
        static final int TRY_TO_LEAVE_YOUR_PHONE_HOME_AS_MUCH_AS_POSSIBLE =9;
        static final int UNINSTALL_ALL_THE_SOCIAL_MEDIA_APPS_AND_ACCES_THEM_FROM_A_BROWSER_OR_COMPUTER = 10;
        static final int USE_BFREE_BREAK_PHONE_ADDICTION =11;

        static final int ALLOW_YOURSELF_TO_LISTEN_TO_MUSIC_ONLY_WHEN_YOU_ARE_DOING_COLD_SHOWERS = 28;

        static final int FREE_YOUR_HOUSE_OF_THEM =12;
        static final int INSTEAD_OF_BRINGING_YOUR_PACK_OF_CIGGARETES_TO_YOU_BRING_A_BOTTLE_OF_WATER_OR_A_FRUIT= 14;
        static final int EAT_HEALTHY_AND_EXERCISE= 15;

        static final int HAVE_YOUR_GAMES_IN_A_HARD_ACCESIBLE_FOLDER= 16;
        static final int ONLY_PLAY_ONE_GAME_AT_A_TIME= 17;
        static final int AVOID_MMOS= 18;

        static final int IF_THE_FIRST_THING_WHEN_YOU_ENTER_YOUR_HOUSE_IS_A_COMFORTABLE_COUCH_AND_A_BIG_TV_IN_FRONT_OF_IT_THEN_CHANGE_THAT=20 ;

        static final int DRINK_LOTS_OF_WATER_AND_FRUITS= 21;

        static final int REALISE_THAT_AN_ALMOST_WIN_IS_A_LOSE= 22;
        static final int TRY_TO_NOT_HAVE_GAMBLING_CENTERS_IN_YOUR_WAY_AT_ALL= 23;

        static final int INSTALL_BOOK_APPS_ON_YOUR_PHONE=24 ;

        static final int TRY_TO_NOT_HAVE_JUNK_FOOD_OR_RESTAURANTS_IN_YOUR_WAY_AT_ALL= 25;
        static final int NEVER_EAT_JUNK_FOOD_AT_HOME_INSTEAD_GO_TO_A_RESTAURANT_IF_YOU_REALLY_CANT_RESIST=26;
        static final int TRY_GETTING_INTO_COOKING_AND_START_MAKING_YOUR_MEALS_AT_HOME_AND_NEVER_HAVE_YOUR_FRIDGE_EMPTY=27;
        static final int HAVE_YOUR_WORKOUT_PLAN_AS_YOUR_PHONE_WALLPAPER= 29;


    }

    public static class GetReminders{
        public static String getReminderName(int Reminder){
            switch (Reminder){
                case 1:return "Remind me to put the controller in another room after I'm done playing";
                case 2:return "Remind me to put the remote ," +
                        "the batteries and the tv cable in in a different room from the tv";
                case 3 :return "Remind me after I'm done reading to put the book on an accessible table";
                case 4:return "Reming me after I'm done drawing to put the drawing kit on an accessible table";
                case 5:return "Reming me after I'm done exercising to prepare my gym clothes for the next time";
            }
            return "";
        }

        public static ArrayList<Intstr_Pojo> getRemindersForGoodHabit(int GoodHabit ){
            ArrayList<Intstr_Pojo>  reminders = new ArrayList<>();
            switch (GoodHabit){
                case GoodHabbits.COLD_SHOWERS:break;

                case GoodHabbits.DRAWING:reminders.
                        add(new Intstr_Pojo(getReminderName(Reminders
                                .AFTER_IM_DONE_PUT_THE_DRAWING_KIT_ON_AN_ACCESIBLE_TABLE),
                                Reminders.AFTER_IM_DONE_PUT_THE_DRAWING_KIT_ON_AN_ACCESIBLE_TABLE,GOOD_REMINDER));break;

                case GoodHabbits.EXERCISE:reminders.add(new Intstr_Pojo(getReminderName
                        (Reminders.AFTER_IM_DONE_EXERCISING_REMIND_ME_TO_PREPARE_MY_GYM_CLOTHES_FOR_THE_NEXT_TIME)
                        ,Reminders.AFTER_IM_DONE_EXERCISING_REMIND_ME_TO_PREPARE_MY_GYM_CLOTHES_FOR_THE_NEXT_TIME,
                        GOOD_REMINDER));break;

                case GoodHabbits.GO_FOR_A_RUN_WALK:break;

                case GoodHabbits.MEDITATION:break;

                case GoodHabbits.READING:reminders.add
                        (new Intstr_Pojo(getReminderName(Reminders.
                                AFTER_IM_DONE_READING_PUT_THE_BOOK_ON_AN_ACCESIBLE_TABLE),
                                Reminders.AFTER_IM_DONE_READING_PUT_THE_BOOK_ON_AN_ACCESIBLE_TABLE,
                                GOOD_REMINDER));break;
            }
            return reminders;
        }

        public static ArrayList<Intstr_Pojo> getRemindersForBadHabit(int BadHabit){
            ArrayList<Intstr_Pojo> reminders = new ArrayList<>();
            switch (BadHabit){
                case BadHabbits.ALCOHOL:break;
                case BadHabbits.DRUGS:break;
                case BadHabbits.GAMBLING:break;
                case BadHabbits.GAMING:reminders.add(new Intstr_Pojo(getReminderName
                        (Reminders.PUT_THE_CONTROLLER_IN_ANOTHER_ROOM_AFTER_YOURE_DONE_PLAYING),
                        Reminders.PUT_THE_CONTROLLER_IN_ANOTHER_ROOM_AFTER_YOURE_DONE_PLAYING,
                        BAD_REMINDER));break;
                case BadHabbits.JUNK_FOOD:break;
                case BadHabbits.OTHER_SUBSTANCES:break;
                case BadHabbits.PORN:break;
                case BadHabbits.SMOKING:break;
                case BadHabbits.SOCIAL_MEDIA:break;
                case BadHabbits.SUGAR:break;
                case BadHabbits.TV:reminders.add(new Intstr_Pojo(getReminderName(Reminders.
                        PUT_THE_REMOTE_BATTERIES_AND_CABLE_IN_DIFFERENT_ROOMS_OF_THE_TV),
                        Reminders.PUT_THE_REMOTE_BATTERIES_AND_CABLE_IN_DIFFERENT_ROOMS_OF_THE_TV,
                        BAD_REMINDER)); break;
            }
                return reminders;
        }
    }



    public  class  GoodHabbits{
        public static final int NO_GOOD_HABIT=0;
        public static final int MEDITATION=1;
        public static final int READING =2;
        public static final int DRAWING =3;
        public static final int EXERCISE =4;
        public static final int COLD_SHOWERS=5;
        public static final int GO_FOR_A_RUN_WALK =6;
    }

    public class BadHabbits{
        public static final int NO_BAD_HABIT =0;
        public static final int DRUGS =1;
        public static final int JUNK_FOOD =2;
        public static final int PORN =3;
        public static final int SOCIAL_MEDIA =4;
        public static final int SUGAR =5;
        public static final int ALCOHOL =6;
        public static final int SMOKING =7;
        public static final int GAMING =8;
        public static final int TV =9;
        public static final int GAMBLING =10;
        public static final int OTHER_SUBSTANCES =11;
    }

    public static String getGoodHabitName(int Habit){
        switch (Habit){
            case GoodHabbits.NO_GOOD_HABIT: return "No habit";
            case GoodHabbits.MEDITATION:return "Meditation";
            case GoodHabbits.READING: return "Reading";
            case GoodHabbits.DRAWING:return  "Drawing";
            case GoodHabbits.EXERCISE:return "Exercise";
            case GoodHabbits.COLD_SHOWERS: return  "Cold Showers";
            case GoodHabbits.GO_FOR_A_RUN_WALK: return "Walk/Run";
        }
        return "No Habit";
    }

    public static String getBadHabitName(int Habit){
        switch (Habit){
            case BadHabbits.NO_BAD_HABIT:return "No Habit";
            case BadHabbits.DRUGS:return "Drugs";
            case BadHabbits.JUNK_FOOD:return "Junk Food";
            case BadHabbits.PORN:return "Porn";
            case BadHabbits.SOCIAL_MEDIA:return "Social media";
            case BadHabbits.SUGAR:return "Sugar/Sweets";
            case BadHabbits.ALCOHOL:return "Alcohol";
            case BadHabbits.SMOKING:return "Smoking";
            case BadHabbits.GAMING:return "Gaming";
            case BadHabbits.TV: return "Tv";
            case BadHabbits.GAMBLING: return "Gambling";
            case BadHabbits.OTHER_SUBSTANCES:return "Other substances";
        }
        return "No Habit";
    }

    public static int getGoal(long daysBetween) {
        if (daysBetween< Goals.FIRST_DAY){return Goals.FIRST_DAY;}
        else if (daysBetween<Goals.SECOND_DAY){return Goals.SECOND_DAY;}
        else if (daysBetween<Goals.THIRD_DAY){return Goals.THIRD_DAY;}
        else if (daysBetween<Goals.FIRST_WEEK){return Goals.FIRST_WEEK;}
        else if (daysBetween<Goals.TEN_DAYS){return Goals.TEN_DAYS;}
        else if (daysBetween<Goals.SECOND_WEEK){return Goals.SECOND_WEEK;}
        else if (daysBetween<Goals.THIRD_WEEK){return Goals.THIRD_WEEK;}
        else if (daysBetween<Goals.FOUR_WEEKS){return Goals.FOUR_WEEKS;}
        else if (daysBetween<Goals.THIRTY_DAYS){return Goals.THIRTY_DAYS;}
        else if (daysBetween<Goals.FIVE_WEEKS){return Goals.FIVE_WEEKS;}
        else if (daysBetween<Goals.SIX_WEEKS){return Goals.SIX_WEEKS;}
        else if (daysBetween<Goals.SEVEN_WEEKS){return Goals.SEVEN_WEEKS;}
        else if (daysBetween<Goals.FIFTY_DAYS){return Goals.FIFTY_DAYS;}
        else if (daysBetween<Goals.TWO_MONTHS){return Goals.TWO_MONTHS;}
        else if (daysBetween<Goals.TEN_WEEKS){return Goals.TEN_WEEKS;}
        else if (daysBetween<Goals.THREE_MONTHS){return Goals.THREE_MONTHS;}
        else if (daysBetween<Goals.ONE_HUNDRED_DAYS){return Goals.ONE_HUNDRED_DAYS;}
        else if (daysBetween<Goals.FIFTEEN_WEEKS){return Goals.FIFTEEN_WEEKS;}
        else if (daysBetween<Goals.FOUR_MONTHS){return Goals.FOUR_MONTHS;}
        else if (daysBetween<Goals.TWENTY_WEEKS){return Goals.TWENTY_WEEKS;}
        else if (daysBetween<Goals.FIVE_MONTHS){return Goals.FIVE_MONTHS;}
        else if (daysBetween<Goals.SIX_MONTHS){return Goals.SIX_MONTHS;}
        else if (daysBetween<Goals.SEVEN_MONTHS){return Goals.SEVEN_MONTHS;}
        else if (daysBetween<Goals.EIGHT_MONTHS){return Goals.EIGHT_MONTHS;}
        else if (daysBetween<Goals.ONE_YEAR){return Goals.ONE_YEAR;}
        else{return Goals.BEYOND_INFINITY;}

    }

    public static String getGoalName(int currentGoal) {
        switch (currentGoal){
            case Goals.FIRST_DAY:return "First day (one of the hardest)";
            case Goals.SECOND_DAY:return "Second day (we're moving fast)";
            case Goals.THIRD_DAY:return "Third day (let's go !)";
            case Goals.FIRST_WEEK:return "First week (cmon,you can do it)";
            case Goals.TEN_DAYS:return "Ten days(''the safe zone'')";
            case Goals.SECOND_WEEK:return "Second week (nice)";
            case Goals.THIRD_WEEK:return "Third week (no one can stop you now)";
            case Goals.FOUR_WEEKS:return "Four weeks (unstoppable)";
            case Goals.THIRTY_DAYS:return "Thirty days (you've almost done it)";
            case Goals.FIVE_WEEKS:return "Five weeks(oh yeah)";
            case Goals.SIX_WEEKS:return "Six weeks (how did you get here)";
            case Goals.SEVEN_WEEKS:return "Seven weeks(do you have super powers?)";
            case Goals.FIFTY_DAYS:return "Fifty days (@ crushing everything)";
            case Goals.TWO_MONTHS:return "Two months (weird flex but ok)";
            case Goals.TEN_WEEKS:return "Ten weeks (aaaaaaaaaaaaa)";
            case Goals.THREE_MONTHS:return "Three months (just look how far you've got)";
            case Goals.ONE_HUNDRED_DAYS:return "100 days (and beyond infinity)";
            case Goals.FIFTEEN_WEEKS:return "15 weeks (remember the first day?)";
            case Goals.FOUR_MONTHS:return "Four months (bbbbbbb)";
            case Goals.TWENTY_WEEKS:return "Twenty weeks (you can do it :)) )";
            case Goals.FIVE_MONTHS:return "Five months(this is what kicking ass means)";
            case Goals.SIX_MONTHS:return "Six months (dkfnmdkfndkfnsfks)";
            case Goals.SEVEN_MONTHS:return "Seven months (high five)";
            case Goals.EIGHT_MONTHS:return "Eight months (you're cheating)";
            case Goals.ONE_YEAR:return "1 freaking year ( oh yeah )";
            case Goals.BEYOND_INFINITY:return "Beyond infinity (haa, got em)";
            default:return "wtf's dis";
        }
    }

    class Goals{
        static final int FIRST_DAY=1;
        static final int SECOND_DAY=2;
        static final int THIRD_DAY=3;
        static final int FIRST_WEEK=7;
        static final int TEN_DAYS=10;
        static final int SECOND_WEEK=14;
        static final int THIRD_WEEK=21;
        static final int FOUR_WEEKS=28;
        static final int THIRTY_DAYS=30;
        static final int FIVE_WEEKS=35;
        static final int SIX_WEEKS=42;
        static final int SEVEN_WEEKS=49;
        static final int FIFTY_DAYS=50;
        static final int TWO_MONTHS=60;
        static final int TEN_WEEKS=70;
        static final int THREE_MONTHS=90;
        static final int ONE_HUNDRED_DAYS=100;
        static final int FIFTEEN_WEEKS=105;
        static final int FOUR_MONTHS=120;
        static final int TWENTY_WEEKS=140;
        static final int FIVE_MONTHS=150;
        static final int SIX_MONTHS=180;
        static final int SEVEN_MONTHS=210;
        static final int EIGHT_MONTHS=240;
        static final int ONE_YEAR=365;
        static final int BEYOND_INFINITY=100000;
    }

    //GETTERS_AND_SETTERS


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
