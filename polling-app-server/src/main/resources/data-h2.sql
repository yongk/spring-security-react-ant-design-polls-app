INSERT INTO roles(id, name) VALUES(1, 'ROLE_USER');
INSERT INTO roles(id, name) VALUES(2, 'ROLE_ADMIN');

INSERT INTO users(id, name, username, email, password, created_at, updated_at)
VALUES (1, 'admin', 'admin', 'admin@qq.com', '$2a$10$t0/k.waL32TDVv2u29P4v.wwCw6KUD3wQMa2kK0mCqCH8UbdNaTTe', now(), now());

INSERT INTO user_roles(user_id, role_id) VALUES (1, 1);