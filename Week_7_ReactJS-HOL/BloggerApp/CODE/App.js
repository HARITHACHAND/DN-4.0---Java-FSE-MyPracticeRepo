import React, { useState } from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import "./App.css";

function App() {
 const [showCourses] = useState(true);
const [showBooks] = useState(true);
const [showBlogs] = useState(true);


  return (
    <div className="container">
      {showCourses && <CourseDetails />}
      {showBooks && <BookDetails />}
      {showBlogs && <BlogDetails />}
    </div>
  );
}

export default App;
