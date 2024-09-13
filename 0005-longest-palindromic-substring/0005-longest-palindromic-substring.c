char* longestPalindrome(char* str1) {
    int len1,max=0,start=0,end=0;
    for(len1=0;str1[len1];len1++);
    int dp[len1][len1];
    for(int i=0;i<len1;i++){
        for(int j=0;j<len1;j++){
            if(i==j){
                dp[i][j]=1;
            }
            else{
            dp[i][j]=0;
            }
        }
    }
    for(int i=0;i<len1;i++){
        for(int j=0;j<i;j++){
                if(str1[i]==str1[j]&&(dp[i-1][j+1]==1||(i-j)<2)){
                    dp[i][j]=1;
                    if((i-j)>max){
                        max=i-j;
                        start=j;
                        end=i;
                    }
                }
        }
       
    }
    char *c=(char*)malloc(1000*sizeof(char*));
    int k=0;
    for(int i=start;i<=end;i++){
        c[k++]=str1[i];
    }
    c[k]='\0';
    strcpy(str1,c);
    return str1;

}