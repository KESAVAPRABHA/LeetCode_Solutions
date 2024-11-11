int longestValidParentheses(char *str){
    int o=0,c=0;
    int len=strlen(str);
    int h=0,max=0;
    for(int j=0,k=len-1;j<len;j++,k--){
        
        if(str[j]=='('){
            o++;
        }
        else if(str[j]==')'){
            o--;
        }
        if(o==-1){
                str[j]='*';
                o=0;
            }
        if(str[k]=='('){
            c--;
        }
        else if(str[k]==')'){
            c++;
        }
        if(c==-1){
                str[k]='*';
                c=0;
            }
        
    }
    for(int f=0;str[f]!='\0';f++){
        if(str[f]!='*'){
            h=h+1;
        }
        else{
            // if(h>max){
            // max=h;
            // }
            h=0;
        }
        if(h>max)
            max=h;
   
    }
     return max;
}
