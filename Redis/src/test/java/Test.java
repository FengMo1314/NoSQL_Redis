import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {
       Jedis j=new Jedis("192.168.88.134",6379,3000);
       j.auth("123456");
//       j.set("data","我是主");
       System.out.println(j.get("msg"));

    }
}
