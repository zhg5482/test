import java.util.Arrays;
public class SequenceList<T>
{
	private final int DEFAULT_SIZE = 16;   //定义一个常量
	
	private int capacity = DEFAULT_SIZE;   //保存数据的容量
	private Object[] elementData;   //用数组实现
	private int size=0; //数组当前元素个数

	public SequenceList() //1.创建一个链表并且初始化
	{
		elementData = new Object[capacity];
	}
	
	public SequenceList(T element) //以一个元素为基础创建链表
	{
		this();
		elementData[0]=element;
		size++;
	}

	public SequenceList(int initSize) //指定初始容量
	{
		//最好要先判断一个传进来的参数
		//指定的容量是2的n次方
		capacity = 1;
		while(capacity < initSize)
		{
			capacity<<=1;
		}
		elementData = new Object[capacity];
	}

	public int Length() //2.获取list的大小
	{
		return size;
	}

	public T get(int index)  //3.获取指定索引处的元素
	{
		//传进来的参数一定要判断其合法性
		if(index<0 || index>size-1)
		{
			throw new IndexOutOfBoundsException("数组下标越界");
		}
		return (T)elementData[index];
	}

	public int indexOf(T element) //4.查找指定元素的索引
	{
		for(int i=0;i<capacity;i++)
		{
			if(element.equals(elementData[i]))
			{
				return i;
			}
		}
		return -1;
	}

	public void insert(T element,int index) //5.在指定位置插入一个元素
	{
		if(index<0 || index>size)
		{
			throw new IndexOutOfBoundsException("数组下标越界");
		}
		//先处理数组长度问题,保证数组长度增加后仍然安全
		if((size+1)>capacity)
		{
			//容量不够了,扩容,把原数组copy到新数组
			while(capacity<(size+1))
			{
				capacity <<=1;
			}
			elementData = Arrays.copyOf(elementData,capacity); //效率不好
		}
		//把index处的数组元素后移
		System.arraycopy(elementData,index,elementData,index+1,size-index);
		elementData[index]=element;
		size++;
	}

	public void insertLast(T element) //6.在尾部新增一个元素
	{
		insert(element,size); //注意尾部是size而不是capacity
	}

	public T remove(int index) //7.删除指定位置的元素
	{
		if(index<0 || index>size-1)
		{
			throw new IndexOutOfBoundsException("线性表索引越界");
		}
		T oldValue = (T)elementData[index];
		int numMoved = size - index - 1; //index后面多少个元素都要前移
		if(numMoved>0)
		{
			System.arraycopy(elementData,index+1,elementData,index,numMoved);
		}
		elementData[--size] = null;
		return oldValue;
	}
	
	public T removeLast() //8.删除尾部元素
	{
		return remove(size-1);
	}

	public boolean empty() //判断表是否为空
	{
		return size==0;
	}

	public void clear() //清空线性表
	{
		Arrays.fill(elementData,null);
		size=0;
	}

	public String toString() //以字符串输出
	{
		if(size==0)
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for(int i=0;i<size;i++)
			{
				//取出一个元素加上一个逗号
				sb.append(elementData[i].toString+", ");//逗号+空格
			}
			//删除最后一个"逗号和空格",加上"[" [3,4,5
			int length = sb.length();
			return sb.replace(length-2,length,"]").toString();		
		}
	}
}	
