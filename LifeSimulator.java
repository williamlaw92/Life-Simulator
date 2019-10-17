/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author williamlaw
 */

import java.util.Scanner;

public class LifeSimulator {
    public static void main (String [] args){
        
        //user inputs
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
          String userName = name.nextLine ();
       
        Scanner job = new Scanner(System.in);
        System.out.println("What job do you wish to have? Choose one: Business Man, Artist, Engineer, Helping Profession");
          String userJob = job.nextLine();
        
        Scanner marry = new Scanner(System.in);
        System.out.println("Do you wish to marry?");
          String userMarry = marry.nextLine();
        
        Scanner children = new Scanner(System.in);
        System.out.println("Do you wish to have children?");
          String userChildren = children.nextLine();
          
        Scanner rules = new Scanner(System.in);
        System.out.println("Do you wish to follow rules?");
          String userRules = rules.nextLine();
        
        Scanner friends = new Scanner(System.in);
        System.out.println("Do you wish to keep in touch with your friends?");
          String userFriends = friends.nextLine();
        
        Scanner society = new Scanner(System.in);
        System.out.println("Do you wish to meaningfully contribute to society?");
          String userSociety = society.nextLine();
        
        Scanner money = new Scanner(System.in);
        System.out.println("Do you wish to save money?");
          String userMoney = money.nextLine();
       
        //intializing variables 
        final String Business_Man = "business man";
        final String Artist = "artist";
        final String Engineer = "engineer";
        final String Helping_Profession = "helping profession";
        final String Chronically_Unemployed = "chronically unemployed";
        String actualJob = "";
        String actualWealth;
        boolean hasChildren = false;
        int numOfChildren = 0;
        String child1Name, child2Name, child3Name, child4Name, child5Name, child6Name, child7Name;
        String child1Gender, child2Gender, child3Gender, child4Gender, child5Gender, child6Gender, child7Gender;
        String isDivorced;
        String isMarried;
        boolean hasGoneToJail;
        boolean inTouchWithFriends;
        boolean contributeToSociety;
        String meaningfulLife = "";
        String retireHappy = "";
        String lavishLife;
        
        child1Name = "William";
        child2Name = "Will";
        child3Name = "Bill";
        child4Name = "Billy";
        child5Name = "Wilma";
        child6Name = "Cindy";
        child7Name = "Sarah";
        
        child1Gender = "male";
        child2Gender = "male";
        child3Gender = "male";
        child4Gender = "male";
        child5Gender = "female";
        child6Gender = "female";
        child7Gender = "female";
             
        
        //prefession probability
        final double jobProbability = Math.random();
       
        if(jobProbability <= 0.30){
           actualJob = Business_Man;
       } else if (jobProbability > 0.30 && jobProbability <= 0.60){
           actualJob = Helping_Profession;
       } else if (jobProbability > 0.60 && jobProbability <= 0.70){
           actualJob = Artist;
       } else if (jobProbability > 0.70 && jobProbability <= 0.75){
           actualJob = Engineer;
       } else if (jobProbability > 0.75 && jobProbability <= 0.80){
           actualJob = Chronically_Unemployed;
       }
       
       //wealth, retire and existential crisis probability
       switch(actualJob){
           case Business_Man:
               if(Math.random() <= 0.70){
                   actualWealth = "will become rich.";
               } else {
                   actualWealth = "will become middle class.";
               }
               
                if (userSociety.equals("yes")){
                    if (Math.random() <= 0.80){
                        contributeToSociety = true;
                          retireHappy =  "You are able to retire.";
                    } else {
                        retireHappy = "You are unable to retire.";
                    }
                } else {
                    contributeToSociety = false;
                        if (Math.random() <= 0.50){
                            meaningfulLife = "You will have an existential crisis and live a meaningless life.";
                        } else {
                            meaningfulLife = "You will live a meaningful life.";
                    }
                }
               break;
               
           case Artist:
               if(Math.random() <= 0.90){
                   actualWealth = "will become poor.";
               } else {
                   actualWealth = "will become rich.";
               } 
               
                if (userSociety.equals("yes")){
                    if (Math.random() <= 0.80){
                        contributeToSociety = true;
                            retireHappy = "You are unable to retire.";
                    } else {
                            retireHappy = "You are able to retire";
                    }
                } else {
                    contributeToSociety = false;
                        if (Math.random() <= 0.20){
                            meaningfulLife = "You will have an existential crisis and live a meaningless life.";
                        } else {
                            meaningfulLife = "You will live a meaningful life.";  
                    }
                }
               break;
           
           case Engineer:
               actualWealth = "will become rich.";
               
               if (userSociety.equals("yes")){
                   contributeToSociety = true;
                        if (Math.random() <= 0.20){
                            retireHappy = "You are unable to retire.";
                        } else {
                            retireHappy = "You are able to retire";
                    }
               } else {
                   contributeToSociety = false;
                        if (Math.random() <= 0.50){
                            meaningfulLife = "You will have an existential crisis and live a meaningless life.";
                        } else {
                            meaningfulLife = "You will live a meaningful life.";
                    }
               }
               break;
               
           case Helping_Profession:
               actualWealth = "will become middle class.";
               
               if (userSociety.equals("yes")){
                   contributeToSociety = true;
                        if (Math.random() <= 0.20){
                            retireHappy = "You are unable to retire.";
                        } else {
                            retireHappy = "You are able to retire";
                    }
               } else {
                   contributeToSociety = false; 
                        if (Math.random() <= 0.20){
                            meaningfulLife = "You will have an existential crisis and live a meaningless life.";
                        } else {
                            meaningfulLife = "You will live a meaningful life.";
                    }
               }
               break;
        
           default: Chronically_Unemployed:
               actualWealth = "will become poor.";
               retireHappy = "You are unable to retire.";
               meaningfulLife = "You will have an existential crisis and live a meaningless life.";
     
       }
    
       //married divorce probability?
       if(userMarry.equals("yes")){
           if(Math.random() <= 0.25){
               isMarried = "You will be divorced";
           } else {
               isMarried = "You will be happily married.";
       } 
           }
       
       //children
       if(userChildren.equals("yes")){
          double childProb = Math.random();
          if (childProb <= 0.30){
            hasChildren = false;
        }else {
            hasChildren = true;
            if (childProb > 0.30 && childProb <= 0.40){
                numOfChildren = 1;
            } else if (childProb > 0.40 && childProb <= 0.50){
                numOfChildren = 2;
            } else if (childProb > 0.50 && childProb <= 0.60){
                numOfChildren = 3;
            } else if (childProb > 0.60 && childProb <= 0.70){
                numOfChildren = 4;      
            } else if (childProb > 0.70 && childProb <= 0.80){
                numOfChildren = 5;
            } else if (childProb > 0.80 && childProb <= 0.90){
                numOfChildren = 6;
            } else if (childProb > 0.90 && childProb <= 1){
                numOfChildren = 7;
            }
        } 
       }
       
      //lawbreaker?
        if(userRules.equals("yes")){
            if(Math.random() <= 0.30){
                hasGoneToJail = true;
            } else {
                actualWealth = "You will be rich.";
            }
        }
       
     //in touch with frieneds? 
        if(userFriends.equals("yes")){
            inTouchWithFriends = (Math.random() <= 0.70);
                inTouchWithFriends = true;
            }
        
     //save money or spend on lavishlife
        if(userMoney.equals("yes")){
            double niceHomeRetireTo = Math.random();
                if (niceHomeRetireTo <= 0.10) {
                 lavishLife = "You will accumulate a lot of things but will be homeless";
                } else {
                    lavishLife = "You will have a home and have a nice retirement.";
                }
               
            }
             
    String lifeParagraph = "";
    lifeParagraph += userName;
    lifeParagraph += " was an interesting person.";
    lifeParagraph += userName + userMoney + userFriends;
    
    if (userMarry.equals("yes")){
        lifeParagraph += (name + " wants to marry");
    }
    
    lifeParagraph += (name + " became a " + actualJob + actualWealth);
    
    if (hasChildren){
        lifeParagraph += "They had " + numOfChildren + " children.";
        if(userChildren.equals("yes")){
            lifeParagraph += "They are very happy!";
        } else {
            lifeParagraph += "They will be very stressed!";
        }
        
        if (numOfChildren >= 1){
            lifeParagraph += "Their 1st child was " + child1Gender + " named " + child1Name + "."; 
        }
        
        if (numOfChildren >= 2){
            lifeParagraph += "Their 2nd child was " + child2Gender + " named " + child2Name + ".";
        }
        
        if (numOfChildren >= 3){
            lifeParagraph += "Their 3rd child was " + child3Gender + " named " + child3Name + ".";
        }
        
        if (numOfChildren >=4){
            lifeParagraph += "Their 4th child was " + child4Gender + " named " + child4Name + ".";
        }
        
        if (numOfChildren >= 5){
            lifeParagraph += "Their 5th child was " + child5Gender + " named " + child5Name + ".";
        }
        
        if (numOfChildren >= 6){
            lifeParagraph += "Their 6th child was " + child6Gender + " named " + child6Name + ".";
        }
        
        if (numOfChildren >= 7){
            lifeParagraph += "Their 7th child was " + child7Gender + " named " + child7Name + ".";
        }
        
    } else 
        if (userChildren.equals("yes")){
            lifeParagraph += "They went to see a fertility doctor.";
        
        } else {
            lifeParagraph += "They are not burdened with childrens";
            }
    
    System.out.println (lifeParagraph);
    
    
    
        }
    
        
    
    
  
    
        
        
        
        } 

          
          
            
            
        

