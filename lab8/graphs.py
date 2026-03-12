import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-5, 5, 400)

# 1. y = kx, k = 0.1 ... 1
plt.figure()
for k in np.arange(0.1, 1.1, 0.1):
    plt.plot(x, k*x, label=f'k={k:.1f}')
plt.title("y = kx")
plt.legend()
plt.grid()

# 2. y = 3x^2
plt.figure()
y = 3*x**2
plt.plot(x, y)
plt.title("y = 3x^2")
plt.grid()

# 3. y = -x^2 + x^3
plt.figure()
y = -x**2 + x**3
plt.plot(x, y)
plt.title("y = -x^2 + x^3")
plt.grid()

# 4. y = x^3 + x^2 + x
plt.figure()
y = x**3 + x**2 + x
plt.plot(x, y)
plt.title("y = x^3 + x^2 + x")
plt.grid()

# 5. y = x^5
plt.figure()
y = x**5
plt.plot(x, y)
plt.title("y = x^5")
plt.grid()

# 6. y = sin(x)
plt.figure()
y = np.sin(x)
plt.plot(x, y)
plt.title("y = sin(x)")
plt.grid()

# 7. y = cos(x - 1) + x
plt.figure()
y = np.cos(x - 1) + x
plt.plot(x, y)
plt.title("y = cos(x - 1) + x")
plt.grid()

plt.show()