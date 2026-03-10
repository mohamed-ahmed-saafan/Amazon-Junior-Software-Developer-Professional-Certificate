    public class ExamSchedule {
        private ExamNode head;
        private ExamNode current;

        public ExamSchedule() {
            this.head = null;
            this.current = null;
        }


        public void addExam(String examDetails) {
            // TODO 2: Implement logic to add an exam to the end of the linked list
            ExamNode newNode = new ExamNode(examDetails);
            if(head == null) {
                head = newNode;
                current = head;
            }
            else {
                ExamNode temp = head;
                while(temp.next!=null) {
                    temp = temp.next;
                }
                temp.next=newNode;
                newNode.prev=temp;
            }
            System.out.println("Exam added successfully" + examDetails);
        }


        public void viewNextExam() {
            if (current == null) {
                System.out.println("No exams available.");
                return;
            }

            System.out.println("Current exam: " + current.examDetails);

            if (current.next != null) {
                current = current.next;
            }
            System.out.println("Next exam: " + current.examDetails);
        }



        public void viewPreviousExam() {
            if (current == null) {
                System.out.println("No exams available.");
                return;
            }

            System.out.println("Current exam: " + current.examDetails);

            if (current.prev != null) {
                current = current.prev;
            }
            System.out.println("Previous exam: " + current.examDetails);
        }


        public void viewAllExamSchedule() {
            ExamNode temp = head;
            if (temp == null) {
                System.out.println("No exams scheduled.");
            } else {
                System.out.println("Exam Schedule:");
                while (temp != null) {
                    System.out.println(temp.examDetails);
                    temp = temp.next;
                }
            }
        }
    }


