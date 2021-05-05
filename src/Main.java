public class Main {
    public static void main(String[] args) {
        StudentSystem s1 = new StudentSystem();
        s1.setName("张三");
        s1.setAge(20);
        s1.setSex("男");
        s1.setMark(98);
        s1.setRank(3);
        s1.showStudent();
        s1.getMarkByName("张三");
        s1.getAgeByName("张三");
        s1.getNameByRank(98);
        s1.showRanksInBoy();
    }
}
