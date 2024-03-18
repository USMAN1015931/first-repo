import React, { useState } from 'react';

const API_URL = 'https://your-api-url.com'; // Replace this with your actual API URL

const SignUpAndLogin = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [loggedIn, setLoggedIn] = useState(false);
  const [error, setError] = useState('');

  const handleSignUp = async () => {
    try {
      const response = await fetch(`${API_URL}/signup`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, password }),
      });
      const data = await response.json();
      if (response.ok) {
        setLoggedIn(true);
        setError('');
      } else {
        setError(data.message);
      }
    } catch (error) {
      setError('Error signing up');
    }
  };

  const handleLogin = async () => {
    try {
      const response = await fetch(`${API_URL}/login`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, password }),
      });
      const data = await response.json();
      if (response.ok) {
        setLoggedIn(true);
        setError('');
      } else {
        setError(data.message);
      }
    } catch (error) {
      setError('Error logging in');
    }
  };

  const handleLogout = () => {
    setLoggedIn(false);
    setEmail('');
    setPassword('');
  };

  return (
    <div>
      {!loggedIn ? (
        <div>
          <h2>Sign Up</h2>
          <input
            type="text"
            placeholder="Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <input
            type="password"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <button onClick={handleSignUp}>Sign Up</button>
          <h2>Login</h2>
          <input
            type="text"
            placeholder="Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <input
            type="password"
            placeholder="Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
          <button onClick={handleLogin}>Login</button>
          {error && <p style={{ color: 'red' }}>{error}</p>}
        </div>
      ) : (
        <div>
          <h2>Welcome, {email}!</h2>
          <button onClick={handleLogout}>Logout</button>
        </div>
      )}
    </div>
  );
};

export default SignUpAndLogin;
