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

## Proto - oneof

## Proto - Wrapper Types

## Proto - Field Numbers

 * Each Field is assigned with unique number.
 * 1-15 for frequently used fields (uses 1 byte)
 * 16-1047 - uses 2 bytes
 * 1 is smallest.
 * 2<sup>29</sup>-1
 * 19000-19999 - reserved
 * Do not change the field number once it is in use.

## Proto - Guidelines

 * 1-15 for frequently used fields.
 * Do noot reorder the fields once it is in use.
 * Adding New fields will not break old proto
 * Removing fields will not break old proto.
    * Use reserved.
 * Changing Type
    * int32 → int64 is OK.
    * int64 → int32 might be a problem.
 * Renaming is OK. But be cautious.
 * Keep the proto as seperate maven-module and add them as dependency in other modules.

