public class StudentSystem {
    private String name;
    private int age;
    private String sex;
    private int rank;
    private int mark;
    public void setRank(int r){
        rank = r;
    }
    public void setMark(int m){
        mark = m;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setSex(String s){
        sex = s;
    }


    public void getMarkByName(String n){
        if (name.equals(n)) {
            System.out.println( n +"的成绩是："+mark);
        }
    }
    public void getNameByRank(int r){
        if (rank == r) {
            System.out.println("排"+r+"名的姓名是："+name);
        }
    }
    public void showRanksInBoy(){
        System.out.println("排名是："+rank);
    }
    public void getAgeByName(String n){
        if (name.equals(n)) {
            System.out.println(n+"的年龄是："+age);

        }
    }
    public void showStudent(){
        System.out.println("姓名："+ name);
        System.out.println("年龄："+ age);
        System.out.println("性别："+ sex);
        System.out.println("分数："+ mark);
        System.out.println("排名："+ rank);
    }
}
