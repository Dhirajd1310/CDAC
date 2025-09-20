class ExampleEquals{
	public static void main(String[]args){
		String str1 = new String("Hello");
		String str2 = new String("hello");
		System.out.println(str1==str2);  //check object reference
		System.out.println(str1.equals(str2));//check object content
		
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		Demo obj3=obj2;
		System.out.println(obj1==obj2);
		System.out.println(obj2==obj3);
		System.out.println(obj1.equals(obj2));
	}
}
class Demo{
	
}

/*
| Expression          | Type of Comparison          | Result  | Reason                         |
| ------------------- | --------------------------- | ------- | ------------------------------ |
| `str1 == str2`      | Reference                   | `false` | Two different String objects   |
| `str1.equals(str2)` | Content (case-sensitive)    | `false` | `"Hello"` ≠ `"hello"`          |
| `obj1 == obj2`      | Reference                   | `false` | Two different Demo objects     |
| `obj2 == obj3`      | Reference                   | `true`  | Both point to same object      |
| `obj1.equals(obj2)` | Reference (`Object.equals`) | `false` | Default behavior (no override) |
*/