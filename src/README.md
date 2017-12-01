A very rudimentary example of the Decorator Pattern.

Each decorator is an object with the same base class as the object that it is decorating.
(Decoratees). This allows each decorator to contain references to not only to a decoratee,
but also a decorated object. That is, once an object is decorated, it is still considered
a decoratee.