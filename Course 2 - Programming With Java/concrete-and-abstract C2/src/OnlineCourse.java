class OnlineCourse extends Course  {
    int videosLessons;
    int weeks;
    OnlineCourse(Subject subject, String instructor, int fee , int videosLessons, int weeks) {
        super(subject, instructor, fee);
        this.videosLessons = videosLessons;
        this.weeks = weeks;
    }
    }

