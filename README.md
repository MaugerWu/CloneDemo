# Object.clone() | Cloneable
&emsp;&emsp;Object 类的 clone 是 protected 的，不能直接调用，可以被子类调用。只有实现了 Cloneable 接口，才可以在该类的实例上调用 clone() 方法，
否则会抛出 CloneNotSupportException。
``` java
package java.lang;
public interface Cloneable {
}
```
``` java
protected native Object clone() throws CloneNotSupportedException;
```

1. [引用拷贝](https://github.com/MaugerWu/CloneDemo/blob/master/Copy.java)：
> &emsp;&emsp;创建一个指向对象的引用变量的拷贝。

2. 对象拷贝：
+ [浅拷贝](https://github.com/MaugerWu/CloneDemo/blob/master/ShallowCopy.java)
> &emsp;&emsp;被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。即对象的浅拷贝会对“主”对象进行拷贝，
 但不会复制主对象里面的对象。”里面的对象“会在原来的对象和它的副本之间共享。
  
 > &emsp;&emsp;简而言之，浅拷贝仅仅复制所考虑的对象，而不复制它所引用的对象。

+ [深拷贝](https://github.com/MaugerWu/CloneDemo/blob/master/DeepCopy.java)
> &emsp;&emsp;深拷贝是一个整个独立的对象拷贝，深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。当对象和它所引用的对象一起拷贝时即发生深拷贝。
深拷贝相比于浅拷贝速度较慢并且花销较大。

> &emsp;简而言之，深拷贝把要复制的对象所引用的对象都复制了一遍。
