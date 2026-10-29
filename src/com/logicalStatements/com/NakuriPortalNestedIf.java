
package com.logicalStatements.com;

import java.util.Scanner;

public class NakuriPortalNestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Hiring Portal!!");

        System.out.println("Enter your Full name:");
        String Fullname = sc.nextLine();
        System.out.println("Hello!! Nice to hear you " + Fullname);

        System.out.println("Enter your Education Qualification:");
        String Edu = sc.next();

        if (Edu.equalsIgnoreCase("B.Tech")
                || Edu.equalsIgnoreCase("Degree")) {

            System.out.println("Nice to hear you are eligible for this role!!");
            System.out.println("Please enter your Department:");
            String dept = sc.next();

            if (dept.equalsIgnoreCase("CSE")
                    || dept.equalsIgnoreCase("IT")
                    || dept.equalsIgnoreCase("ECE")) {

                System.out.println("Your department is suitable for this role.");

                System.out.println("Enter your CGPA:");
                double CGPA = sc.nextDouble();

                if (CGPA >= 8.0) {

                    System.out.println("Nice!! Your CGPA meets the requirement.");

                    System.out.println("Do you have any Backlogs? (true/false)");
                    boolean blogs = sc.nextBoolean();

                    if (blogs) {

                        System.out.println(
                            "You have active backlogs. Not eligible for this role."
                        );

                    } else {

                        System.out.println(
                            "Congratulations! You are shortlisted. No backlogs!"
                        );

                        sc.nextLine(); 

                        System.out.println("Enter your technical skills:");
                        String techSkills = sc.nextLine();

                        if (techSkills.equalsIgnoreCase("Java")
                                || techSkills.equalsIgnoreCase("Python")) {

                            System.out.println(
                                "Nice! You have the required skills."
                            );

                            System.out.println("Enter your present job status:");
                            String Jobs = sc.next();

                            if (Jobs.equalsIgnoreCase("Fresher")
                                    || Jobs.equalsIgnoreCase("Freshers")) {

                                System.out.println(
                                    "Nice! You are a fresher. Continue to the next step!"
                                );

                                System.out.println(
                                    "You have successfully applied for this role!"
                                );

                            } else if (Jobs.equalsIgnoreCase("Experienced")) {

                                System.out.println("You can check for experienced roles!");

                            } else {

                                System.out.println("Invalid job status.");
                            }

                        } else {

							System.out.println("You don't have sufficient skills. Try other roles!");
                        }
                    }

                } else {

                    System.out.println("Your CGPA is not sufficient for this role.");
                }

            } else {

                System.out.println("Your department is not suitable for this role.");
            }

        } else {

            System.out.println("You may try for another role!");
        }

        sc.close();
    }
}
