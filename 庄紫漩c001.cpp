#include <stdio.h>
#include <stdlib.h>
void main()
{ float a[4][5],sum1,sum2;
  int i,j;
 for(i=0;i<3;i++)
   for(j=0;j<4;j++)
     scanf("%f",&a[i][j]);
 for(i=0;i<3;i++)
  {sum1=0;
   for(j=0;j<4;j++)
     sum1+=a[i][j];
     a[i][4]=sum1/4;
  }
 for(j=0;j<5;j++)
 {  sum2=0;
    for(i=0;i<3;i++)
      sum2+=a[i][j];
      a[3][j]=sum2/3;
   }
  for(i=0;i<4;i++)
  {  for(j=0;j<5;j++)
     printf("%6.2f",a[i][j]);
     printf("\n");
   }
}

