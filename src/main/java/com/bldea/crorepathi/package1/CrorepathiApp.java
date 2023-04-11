package com.bldea.crorepathi.package1;

import java.util.Scanner;

public class CrorepathiApp {
	public static void main(String[] args) throws Exception{
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Lets welcome our first candidate");
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your state?");
		String state = sc.next();

		Candidate c1 = new Candidate(name, age, city, state);
		
		System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());

		System.out.println("The rules of the game:");
		System.out.println("1. There will be 10 question which rewards a specific amount in "
				+ "incremental order");
		System.out.println("2. The game will contain 3 life lines. "
				+ "(audiance phone, 50-50 and skip the question");
		System.out.println("3. You can quit the game at any stage.");

		System.out.println("Please type 1 if you wish to see the reward per question. "
				+ "else type any other number.");
		int type_1 = sc.nextInt();
		if(type_1==1) {
			System.out.println("Question-1 : 1000 \n"+
					"Question-2 : 5000 \n"+
					"Question-3 : 10000 \n"+
					"Question-4 : 20000 \n"+
					"Question-5 : 40000 \n");
			System.out.println("Do you wish to continue?? (type: YES/NO)");
		}
		else {
			System.out.println("Do you wish to continue?? (type: YES/NO)");
		}
		String type_2 = sc.next();

		if(type_2.equalsIgnoreCase("yes")==true) {
			System.out.println("Lets Begin the Game");
			System.out.println("Here is the first question.");
			boolean res1 = Questions.fetchQuestion1(c1.getName());
			if(res1==true) {
				System.out.println("Congratulations!! Your Answer is correct.\n"
						+ "You have won Rs."+c1.getAmount());
				System.out.println("Here is your next question.");
				boolean res2 = Questions.fetchQuestion2(c1.getName());
				if(res2==true) {
					System.out.println("Congratulations!! Your Answer is correct.\n"
							+ "You have won Rs."+c1.getAmount());
					System.out.println("Here is your next question.");
					boolean res3 = Questions.fetchQuestion3(c1.getName());
					if(res2==true) {
						System.out.println("Congratulations!! Your Answer is correct.\n"
								+ "You have won Rs."+c1.getAmount());
						System.out.println("Here is your next question.");
						boolean res4 = Questions.fetchQuestion4(c1.getName());
						if(res2==true) {
							System.out.println("Congratulations!! Your Answer is correct.\n"
									+ "You have won Rs."+c1.getAmount());
							System.out.println("Here is your next question.");
							boolean res5 = Questions.fetchQuestion5(c1.getName());
							if(res2==true) {
								System.out.println("Congratulations!! Your Answer is correct.\n"
										+ "You have won Rs."+c1.getAmount());
								System.out.println("Here is your next question.");
								boolean res6 = Questions.fetchQuestion6(c1.getName());
								if(res2==true) {
									System.out.println("Congratulations!! Your Answer is correct.\n"
											+ "You have won Rs."+c1.getAmount());
									System.out.println("Here is your next question.");
									boolean res7 = Questions.fetchQuestion7(c1.getName());
									if(res2==true) {
										System.out.println("Congratulations!! Your Answer is correct.\n"
												+ "You have won Rs."+c1.getAmount());
										System.out.println("Here is your next question.");
										boolean res8 = Questions.fetchQuestion8(c1.getName());
										if(res2==true) {
											System.out.println("Congratulations!! Your Answer is correct.\n"
													+ "You have won Rs."+c1.getAmount());
											System.out.println("Here is your next question.");
											boolean res9 = Questions.fetchQuestion9(c1.getName());
											if(res2==true) {
												System.out.println("Congratulations!! Your Answer is correct.\n"
														+ "You have won Rs."+c1.getAmount());
												System.out.println("Here is your next question.");
												boolean res10 = Questions.fetchQuestion10(c1.getName());
												if(res2==true) {
													System.out.println("Congratulations!! Your Answer is correct.\n"
															+ "You have won Rs."+c1.getAmount());
													System.out.println("Here is your next question.");
												}
												else {
													System.out.println("Thank you for coming. All the best!!");
												}
											}
											else {
												System.out.println("Thank you for coming. All the best!!");
											}
										}
										else {
											System.out.println("Thank you for coming. All the best!!");
										}
									}
									else {
										System.out.println("Thank you for coming. All the best!!");
									}
								}
								else {
									System.out.println("Thank you for coming. All the best!!");
								}
							}
							else {
								System.out.println("Thank you for coming. All the best!!");
							}
						}
						else {
							System.out.println("Thank you for coming. All the best!!");
						}
					}
					else {
						System.out.println("Thank you for coming. All the best!!");
					}
				}
				else {
					System.out.println("Thank you for coming. All the best!!");
				}
			}
			else {
				System.out.println("Thank you for coming. All the best!!");
			}
		}
		else {
			System.out.println("Thank you for coming. All the best!!");
		}
	}

}

