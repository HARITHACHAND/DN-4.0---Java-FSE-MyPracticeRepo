import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Step 6: Fetch posts using Fetch API
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const data = await response.json();

      const postsList = data.map(post => new Post(post.userId, post.id, post.title, post.body));

      this.setState({ posts: postsList });
    } catch (error) {
      console.error("Fetch error:", error);
      this.setState({ hasError: true });
    }
  };

  // Step 7: Call loadPosts after mounting
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Error boundary
  componentDidCatch(error, info) {
    alert("An error occurred in Posts component.");
    console.error("Error caught:", error, info);
    this.setState({ hasError: true });
  }

  // Step 8: Render posts
  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong.</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
