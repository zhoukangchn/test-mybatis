package com.example.model;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    private Long currentConnections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    private Long totalConnections;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER
     *
     * @return the value of users.USER
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER
     *
     * @param user the value for users.USER
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.CURRENT_CONNECTIONS
     *
     * @return the value of users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public Long getCurrentConnections() {
        return currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.CURRENT_CONNECTIONS
     *
     * @param currentConnections the value for users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.TOTAL_CONNECTIONS
     *
     * @return the value of users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public Long getTotalConnections() {
        return totalConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.TOTAL_CONNECTIONS
     *
     * @param totalConnections the value for users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Tue Feb 27 22:17:41 CST 2024
     */
    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }
}