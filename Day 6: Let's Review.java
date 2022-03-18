 Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
    String s= new String();
   
    while(n!=0){
         s=sc.next();
    for(int i=0;i<s.length();i++){
        if((i+2)%2==0){
            System.out.print(s.charAt(i));
        }        
    }
    System.out.print(" ");
    for(int i=0;i<s.length();i++){
    if((i+2)%2!=0){
            System.out.print(s.charAt(i));
        }
    
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
    }
    
    System.out.println();
    n--;
    }
