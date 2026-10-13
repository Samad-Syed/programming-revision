#include <stdio.h>
#define NAME_LENGTH 32

int main()
{
    char name[NAME_LENGTH];

    printf("Enter the name : ");
    scanf("%s", name);
    printf("Hello %s!!\n", name);
    return 0;
}
