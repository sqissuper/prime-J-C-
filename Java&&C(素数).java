
Java

//判断一个数是不是素数
//    public static void isPrime(int n){
//        boolean flag = false;
//        for(int i = 2; i < Math.sqrt(n); i++){//平方n ，优化代码
//            flag = true;
//            if(n % i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("是素数！");
//        }else{
//            System.out.println("不是素数！");
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();//输入一个数
//        isPrime(n);
//    }
//输出素数
    //    public static void nisPrime(int n){
//        int i,j;
//        for(i = 2; i <= n; i++){
//            boolean flag = true;
//            for(j = 2; j < i; j++){
//                if(i % j == 0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.print(i + " ");
//            }
//        }
//    }



C

//判断素数
//方法一：
#include<math.h>
void isprime(int n)
{
	int i;
	int flag = 0;
	for (i = 2; i < sqrt(n); i++)//平方n，优化代码
	{
		flag = 1;
		if (n % i == 0)
		{
			flag = 0;
			break;
		}
	}
	if (flag == 1)
	{
		printf("是素数！\n");
	}
	else
	{
		printf("不是素数！\n");
	}
}

方法二：
void isprime(int n)
{
	int i;
	int flag = 0;
	for (i = 2; i < sqrt(n); i++)
	{
		flag = 1;
		if (n % i == 0)
		{
			flag = 0;
			break;
		}
	}
	if (flag == 1)
	{
		printf("是素数！\n");
	}
	else
	{
		printf("不是素数！\n");
	}
}

int main()
{
	int n = 0;
	scanf("%d", &n);

	isprime(n);
	return 0;
}


//输出素数
//方法一：
void isprime(int n)
{
	int i, j;
	for (i = 2; i < n; i++)
	{
		for (j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				j = 0;
				break;
			}
		}
		if (j != 0)
		{
			printf("%d ", i);
		}
	}
}

//方法二：
void isprime(int n)
{
	int i, j;
	int flag = 0;
	for (i = 2; i < n; i++)
	{
		flag = 1;
		for (j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag)
		{
			printf("%d ", i);
		}
	}
}

int main()
{
	int n = 0;
	scanf("%d", &n);
	isprime(n);
	return 0;
}