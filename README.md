# Introduction (Protocol Buffers)

  *	IDL (Interface description language) for API.
  * Platform neutral.
  *	Language neutral.
  *	Serializing/Deserializing structured data.
  *	Very Fast/Optimized for inter services communication.
  *	Provides client libraries automatically for many languages.

Ex: Java, C++ Javascript, GO, Ruby, C#, Python

```bash
Public class Person { 			message Person {
    private String name;		 string name =1;
    private int age;			   int32 = 2;
}                            }        
```

## Proto - Types

| Java Type     | Proto Type    |
| ------------- | ------------- |
| int           | int32         |
| long          | int64         |
| float         | float         |
| double        | double        |
| boolean       | bool          |
| String        | string        |
| byte          | bytes         |

## Proto - Collections & Map

| Java Type          | Proto Type    |
| ------------------ | ------------- |
| Collection/List    | repeated      |
| Map                | map           |

## Proto - Default Values

| Proto Type                      | Default Value        |
| ------------------------------- | ---------------------|
| int32/ any number type          | 0                    |
| bool                            | false                |
| string                          | empty string         |
| enum                            | first value          |
| repeated                        | empty list           |
| map                             | wrapper / empty map  |
