resource "aws_eks_cluster" "this" {
  name     = var.clusternam
  role_arn = var.role-arn

  vpc_config {
    subnet_ids = var.vpc-id
  }
}
