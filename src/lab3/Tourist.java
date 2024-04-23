package lab3;

class Tourist {
    String name;
    int money;
    String access;

    Tourist(String name, int money, String access) {
        this.name = name;
        this.money = money;
        this.access = access;
    }
}

class Group {
    String name;
    int countOfTourists;
    Tourist[] tourists;

    Group(){

    }

    Group(String name, int countOfTourists,Tourist[] tourists) {
        this.name = name;
        this.countOfTourists = countOfTourists;
        this.tourists = tourists;
    }

    String expeditionPlan() {
        int totalBudget = 0;

        for(Tourist tourist : tourists) {
            if(tourist.access.equals("YES")) {
                totalBudget += tourist.money;
            }
        }
        if (totalBudget >= 20000) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


