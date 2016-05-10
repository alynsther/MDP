# Running instructions

/*****************************************************************************
 File:   MDPSolver.java
 Author: Son Ngo, Venecia Xu, Adela Yang
 Date:   April 2016
 
 Description: Main file for Assignment 5

 
 Running instructions:
 javac MDPSolver.java
 java MDPSolver discount error key positive negative step solution
 
 java MDPSolver 0.99 1e-6 0.5 1 -1 -0.04 v

 NOTE: Use a discount factor of less than 1.0 for Policy Iteration
 ******************************************************************************/

 java MDPSolver discount error key positive negative step solution
    discount    = discount factor
    error       = maximum allowable error in the state utilities
    key         = key loss probability
    positive    = positive terminal state reward
    negative    = negative terminal state reward
    step        = step cost
    solution    = solution technique
                    v  = value iteration
                    p  = policy iteration iteration