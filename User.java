public class User
{
 private String name;
 private Integer age;

 public User () {

 }
 public User (String name, Integer age) {
 this.name = name;
 this.age = age;
 }

 public String toString() {
  return name + ", возраст " + String.valueOf(age);
 }

 public String getName () {
  return name;
 }

 public void setName (String s) {
  name = s;
 }
 public Integer getAge () {
  return age;
 }

 public void setAge (Integer age) {
  this.age = age;
 }

}