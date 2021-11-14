package com.company;

public class Main {

    public static void main(String[] args) {
        public class Person {

            private final String lastName;
            private final String firstName;
            private final String middleName;
            private final String streetAddress;
            private final String city;
            private final String state;
            private final int age;
            private final int phone;
            private final boolean isFemale;

            public Person(
                    final String newLastName,
                    final String newFirstName,
                    final String newMiddleName,
                    final String newStreetAddress,
                    final String newCity,
                    final String newState,
                    final int newAge) {

                this.lastName = newLastName;
                this.firstName = newFirstName;
                this.middleName = newMiddleName;
                this.streetAddress = newStreetAddress;
                this.city = newCity;
                this.state = newState;
                this.age = newAge;
            }

            public String getLastName() {
                return lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getMiddleName() {
                return middleName;
            }

            public String getStreetAddress() {
                return streetAddress;
            }

            public String getCity() {
                return city;
            }

            public String getState() {
                return state;
            }

            public boolean isFemale() {
                return isFemale;
            }

            public static class Builder {

                private String nestedLastName;
                private String nestedFirstName;
                private String nestedMiddleName;
                private String nestedStreetAddress;
                private String nestedCity;
                private String nestedState;
                private boolean nestedIsFemale;

                public Builder setNestedLastName(String nestedLastName) {
                    this.nestedLastName = nestedLastName;

                    return this;
                }

                public Builder setNestedFirstName(String nestedFirstName) {
                    this.nestedFirstName = nestedFirstName;

                    return this;
                }

                public Builder setNestedMiddleName(String nestedMiddleName) {
                    this.nestedMiddleName = nestedMiddleName;

                    return this;
                }

                public Builder setNestedStreetAddress(String nestedStreetAddress) {
                    this.nestedStreetAddress = nestedStreetAddress;

                    return this;
                }

                public Builder setNestedCity(String nestedCity) {
                    this.nestedCity = nestedCity;

                    return this;
                }

                public Builder setNestedState(String nestedState) {
                    this.nestedState = nestedState;

                    return this;
                }

                public Builder setNestedIsFemale(boolean nestedIsFemale) {
                    this.nestedIsFemale = nestedIsFemale;

                    return this;

                }

                public Person build() {
                    return new Person(
                            nestedLastName, nestedFirstName, nestedMiddleName,
                            nestedStreetAddress, nestedCity, nestedState,
                            nestedIsFemale);
                }

            }

        }
    }
}
