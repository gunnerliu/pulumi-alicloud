// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type NodePool struct {
	pulumi.CustomResourceState

	// The id of kubernetes cluster.
	ClusterId pulumi.StringOutput         `pulumi:"clusterId"`
	DataDisks NodePoolDataDiskArrayOutput `pulumi:"dataDisks"`
	// Custom Image support. Must based on CentOS7 or AliyunLinux2.
	ImageId pulumi.StringOutput `pulumi:"imageId"`
	// The instance type of worker node.
	InstanceTypes pulumi.StringArrayOutput `pulumi:"instanceTypes"`
	// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields. Only `keyName` is supported in the management node pool.
	KeyName pulumi.StringPtrOutput `pulumi:"keyName"`
	// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	KmsEncryptedPassword pulumi.StringPtrOutput `pulumi:"kmsEncryptedPassword"`
	// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
	Labels NodePoolLabelArrayOutput `pulumi:"labels"`
	// Managed node pool configuration. When using a managed node pool, the node key must use `keyName`. Detailed below.
	Management NodePoolManagementPtrOutput `pulumi:"management"`
	// The name of node pool.
	Name pulumi.StringOutput `pulumi:"name"`
	// The worker node number of the node pool. From version 1.111.0, `nodeCount` is not required.
	NodeCount pulumi.IntOutput `pulumi:"nodeCount"`
	// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
	NodeNameMode pulumi.StringOutput `pulumi:"nodeNameMode"`
	// The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Auto scaling node pool configuration. For more details, see `scalingConfig`.
	ScalingConfig NodePoolScalingConfigOutput `pulumi:"scalingConfig"`
	// (Available in 1.105.0+) Id of the Scaling Group.
	ScalingGroupId pulumi.StringOutput `pulumi:"scalingGroupId"`
	// The system disk size of worker node.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
	SystemDiskCategory pulumi.StringPtrOutput `pulumi:"systemDiskCategory"`
	// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
	SystemDiskSize pulumi.IntPtrOutput `pulumi:"systemDiskSize"`
	// A List of tags to assign to the resource. It will be applied for ECS instances finally.
	// * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
	// * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// A List of Kubernetes taints to assign to the nodes.
	Taints NodePoolTaintArrayOutput `pulumi:"taints"`
	// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// The ID of VPC where the current cluster is located.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The vswitches used by node pool workers.
	VswitchIds pulumi.StringArrayOutput `pulumi:"vswitchIds"`
}

// NewNodePool registers a new resource with the given unique name, arguments, and options.
func NewNodePool(ctx *pulumi.Context,
	name string, args *NodePoolArgs, opts ...pulumi.ResourceOption) (*NodePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.InstanceTypes == nil {
		return nil, errors.New("invalid value for required argument 'InstanceTypes'")
	}
	if args.VswitchIds == nil {
		return nil, errors.New("invalid value for required argument 'VswitchIds'")
	}
	var resource NodePool
	err := ctx.RegisterResource("alicloud:cs/nodePool:NodePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodePool gets an existing NodePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodePoolState, opts ...pulumi.ResourceOption) (*NodePool, error) {
	var resource NodePool
	err := ctx.ReadResource("alicloud:cs/nodePool:NodePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodePool resources.
type nodePoolState struct {
	// The id of kubernetes cluster.
	ClusterId *string            `pulumi:"clusterId"`
	DataDisks []NodePoolDataDisk `pulumi:"dataDisks"`
	// Custom Image support. Must based on CentOS7 or AliyunLinux2.
	ImageId *string `pulumi:"imageId"`
	// The instance type of worker node.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields. Only `keyName` is supported in the management node pool.
	KeyName *string `pulumi:"keyName"`
	// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
	Labels []NodePoolLabel `pulumi:"labels"`
	// Managed node pool configuration. When using a managed node pool, the node key must use `keyName`. Detailed below.
	Management *NodePoolManagement `pulumi:"management"`
	// The name of node pool.
	Name *string `pulumi:"name"`
	// The worker node number of the node pool. From version 1.111.0, `nodeCount` is not required.
	NodeCount *int `pulumi:"nodeCount"`
	// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
	NodeNameMode *string `pulumi:"nodeNameMode"`
	// The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	Password *string `pulumi:"password"`
	// Auto scaling node pool configuration. For more details, see `scalingConfig`.
	ScalingConfig *NodePoolScalingConfig `pulumi:"scalingConfig"`
	// (Available in 1.105.0+) Id of the Scaling Group.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
	// The system disk size of worker node.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
	SystemDiskCategory *string `pulumi:"systemDiskCategory"`
	// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
	SystemDiskSize *int `pulumi:"systemDiskSize"`
	// A List of tags to assign to the resource. It will be applied for ECS instances finally.
	// * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
	// * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// A List of Kubernetes taints to assign to the nodes.
	Taints []NodePoolTaint `pulumi:"taints"`
	// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
	UserData *string `pulumi:"userData"`
	// The ID of VPC where the current cluster is located.
	VpcId *string `pulumi:"vpcId"`
	// The vswitches used by node pool workers.
	VswitchIds []string `pulumi:"vswitchIds"`
}

type NodePoolState struct {
	// The id of kubernetes cluster.
	ClusterId pulumi.StringPtrInput
	DataDisks NodePoolDataDiskArrayInput
	// Custom Image support. Must based on CentOS7 or AliyunLinux2.
	ImageId pulumi.StringPtrInput
	// The instance type of worker node.
	InstanceTypes pulumi.StringArrayInput
	// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields. Only `keyName` is supported in the management node pool.
	KeyName pulumi.StringPtrInput
	// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	KmsEncryptedPassword pulumi.StringPtrInput
	// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
	Labels NodePoolLabelArrayInput
	// Managed node pool configuration. When using a managed node pool, the node key must use `keyName`. Detailed below.
	Management NodePoolManagementPtrInput
	// The name of node pool.
	Name pulumi.StringPtrInput
	// The worker node number of the node pool. From version 1.111.0, `nodeCount` is not required.
	NodeCount pulumi.IntPtrInput
	// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
	NodeNameMode pulumi.StringPtrInput
	// The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	Password pulumi.StringPtrInput
	// Auto scaling node pool configuration. For more details, see `scalingConfig`.
	ScalingConfig NodePoolScalingConfigPtrInput
	// (Available in 1.105.0+) Id of the Scaling Group.
	ScalingGroupId pulumi.StringPtrInput
	// The system disk size of worker node.
	SecurityGroupId pulumi.StringPtrInput
	// The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
	SystemDiskCategory pulumi.StringPtrInput
	// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
	SystemDiskSize pulumi.IntPtrInput
	// A List of tags to assign to the resource. It will be applied for ECS instances finally.
	// * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
	// * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
	Tags pulumi.MapInput
	// A List of Kubernetes taints to assign to the nodes.
	Taints NodePoolTaintArrayInput
	// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
	UserData pulumi.StringPtrInput
	// The ID of VPC where the current cluster is located.
	VpcId pulumi.StringPtrInput
	// The vswitches used by node pool workers.
	VswitchIds pulumi.StringArrayInput
}

func (NodePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolState)(nil)).Elem()
}

type nodePoolArgs struct {
	// The id of kubernetes cluster.
	ClusterId string             `pulumi:"clusterId"`
	DataDisks []NodePoolDataDisk `pulumi:"dataDisks"`
	// Custom Image support. Must based on CentOS7 or AliyunLinux2.
	ImageId *string `pulumi:"imageId"`
	// The instance type of worker node.
	InstanceTypes []string `pulumi:"instanceTypes"`
	// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields. Only `keyName` is supported in the management node pool.
	KeyName *string `pulumi:"keyName"`
	// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
	Labels []NodePoolLabel `pulumi:"labels"`
	// Managed node pool configuration. When using a managed node pool, the node key must use `keyName`. Detailed below.
	Management *NodePoolManagement `pulumi:"management"`
	// The name of node pool.
	Name *string `pulumi:"name"`
	// The worker node number of the node pool. From version 1.111.0, `nodeCount` is not required.
	NodeCount *int `pulumi:"nodeCount"`
	// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
	NodeNameMode *string `pulumi:"nodeNameMode"`
	// The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	Password *string `pulumi:"password"`
	// Auto scaling node pool configuration. For more details, see `scalingConfig`.
	ScalingConfig *NodePoolScalingConfig `pulumi:"scalingConfig"`
	// The system disk size of worker node.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
	SystemDiskCategory *string `pulumi:"systemDiskCategory"`
	// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
	SystemDiskSize *int `pulumi:"systemDiskSize"`
	// A List of tags to assign to the resource. It will be applied for ECS instances finally.
	// * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
	// * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// A List of Kubernetes taints to assign to the nodes.
	Taints []NodePoolTaint `pulumi:"taints"`
	// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
	UserData *string `pulumi:"userData"`
	// The vswitches used by node pool workers.
	VswitchIds []string `pulumi:"vswitchIds"`
}

// The set of arguments for constructing a NodePool resource.
type NodePoolArgs struct {
	// The id of kubernetes cluster.
	ClusterId pulumi.StringInput
	DataDisks NodePoolDataDiskArrayInput
	// Custom Image support. Must based on CentOS7 or AliyunLinux2.
	ImageId pulumi.StringPtrInput
	// The instance type of worker node.
	InstanceTypes pulumi.StringArrayInput
	// The keypair of ssh login cluster node, you have to create it first. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields. Only `keyName` is supported in the management node pool.
	KeyName pulumi.StringPtrInput
	// An KMS encrypts password used to a cs kubernetes. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	KmsEncryptedPassword pulumi.StringPtrInput
	// A List of Kubernetes labels to assign to the nodes . Only labels that are applied with the ACK API are managed by this argument.
	Labels NodePoolLabelArrayInput
	// Managed node pool configuration. When using a managed node pool, the node key must use `keyName`. Detailed below.
	Management NodePoolManagementPtrInput
	// The name of node pool.
	Name pulumi.StringPtrInput
	// The worker node number of the node pool. From version 1.111.0, `nodeCount` is not required.
	NodeCount pulumi.IntPtrInput
	// Each node name consists of a prefix, an IP substring, and a suffix. For example "customized,aliyun.com,5,test", if the node IP address is 192.168.0.55, the prefix is aliyun.com, IP substring length is 5, and the suffix is test, the node name will be aliyun.com00055test.
	NodeNameMode pulumi.StringPtrInput
	// The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
	Password pulumi.StringPtrInput
	// Auto scaling node pool configuration. For more details, see `scalingConfig`.
	ScalingConfig NodePoolScalingConfigPtrInput
	// The system disk size of worker node.
	SecurityGroupId pulumi.StringPtrInput
	// The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
	SystemDiskCategory pulumi.StringPtrInput
	// The system disk category of worker node. Its valid value range [40~500] in GB. Default to `120`.
	SystemDiskSize pulumi.IntPtrInput
	// A List of tags to assign to the resource. It will be applied for ECS instances finally.
	// * key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot be a null string.
	// * value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be a null string.
	Tags pulumi.MapInput
	// A List of Kubernetes taints to assign to the nodes.
	Taints NodePoolTaintArrayInput
	// Windows instances support batch and PowerShell scripts. If your script file is larger than 1 KB, we recommend that you upload the script to Object Storage Service (OSS) and pull it through the internal endpoint of your OSS bucket.
	UserData pulumi.StringPtrInput
	// The vswitches used by node pool workers.
	VswitchIds pulumi.StringArrayInput
}

func (NodePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodePoolArgs)(nil)).Elem()
}

type NodePoolInput interface {
	pulumi.Input

	ToNodePoolOutput() NodePoolOutput
	ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput
}

func (*NodePool) ElementType() reflect.Type {
	return reflect.TypeOf((*NodePool)(nil))
}

func (i *NodePool) ToNodePoolOutput() NodePoolOutput {
	return i.ToNodePoolOutputWithContext(context.Background())
}

func (i *NodePool) ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolOutput)
}

func (i *NodePool) ToNodePoolPtrOutput() NodePoolPtrOutput {
	return i.ToNodePoolPtrOutputWithContext(context.Background())
}

func (i *NodePool) ToNodePoolPtrOutputWithContext(ctx context.Context) NodePoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolPtrOutput)
}

type NodePoolPtrInput interface {
	pulumi.Input

	ToNodePoolPtrOutput() NodePoolPtrOutput
	ToNodePoolPtrOutputWithContext(ctx context.Context) NodePoolPtrOutput
}

type nodePoolPtrType NodePoolArgs

func (*nodePoolPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NodePool)(nil))
}

func (i *nodePoolPtrType) ToNodePoolPtrOutput() NodePoolPtrOutput {
	return i.ToNodePoolPtrOutputWithContext(context.Background())
}

func (i *nodePoolPtrType) ToNodePoolPtrOutputWithContext(ctx context.Context) NodePoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolPtrOutput)
}

// NodePoolArrayInput is an input type that accepts NodePoolArray and NodePoolArrayOutput values.
// You can construct a concrete instance of `NodePoolArrayInput` via:
//
//          NodePoolArray{ NodePoolArgs{...} }
type NodePoolArrayInput interface {
	pulumi.Input

	ToNodePoolArrayOutput() NodePoolArrayOutput
	ToNodePoolArrayOutputWithContext(context.Context) NodePoolArrayOutput
}

type NodePoolArray []NodePoolInput

func (NodePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NodePool)(nil))
}

func (i NodePoolArray) ToNodePoolArrayOutput() NodePoolArrayOutput {
	return i.ToNodePoolArrayOutputWithContext(context.Background())
}

func (i NodePoolArray) ToNodePoolArrayOutputWithContext(ctx context.Context) NodePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolArrayOutput)
}

// NodePoolMapInput is an input type that accepts NodePoolMap and NodePoolMapOutput values.
// You can construct a concrete instance of `NodePoolMapInput` via:
//
//          NodePoolMap{ "key": NodePoolArgs{...} }
type NodePoolMapInput interface {
	pulumi.Input

	ToNodePoolMapOutput() NodePoolMapOutput
	ToNodePoolMapOutputWithContext(context.Context) NodePoolMapOutput
}

type NodePoolMap map[string]NodePoolInput

func (NodePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NodePool)(nil))
}

func (i NodePoolMap) ToNodePoolMapOutput() NodePoolMapOutput {
	return i.ToNodePoolMapOutputWithContext(context.Background())
}

func (i NodePoolMap) ToNodePoolMapOutputWithContext(ctx context.Context) NodePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodePoolMapOutput)
}

type NodePoolOutput struct {
	*pulumi.OutputState
}

func (NodePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NodePool)(nil))
}

func (o NodePoolOutput) ToNodePoolOutput() NodePoolOutput {
	return o
}

func (o NodePoolOutput) ToNodePoolOutputWithContext(ctx context.Context) NodePoolOutput {
	return o
}

func (o NodePoolOutput) ToNodePoolPtrOutput() NodePoolPtrOutput {
	return o.ToNodePoolPtrOutputWithContext(context.Background())
}

func (o NodePoolOutput) ToNodePoolPtrOutputWithContext(ctx context.Context) NodePoolPtrOutput {
	return o.ApplyT(func(v NodePool) *NodePool {
		return &v
	}).(NodePoolPtrOutput)
}

type NodePoolPtrOutput struct {
	*pulumi.OutputState
}

func (NodePoolPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodePool)(nil))
}

func (o NodePoolPtrOutput) ToNodePoolPtrOutput() NodePoolPtrOutput {
	return o
}

func (o NodePoolPtrOutput) ToNodePoolPtrOutputWithContext(ctx context.Context) NodePoolPtrOutput {
	return o
}

type NodePoolArrayOutput struct{ *pulumi.OutputState }

func (NodePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NodePool)(nil))
}

func (o NodePoolArrayOutput) ToNodePoolArrayOutput() NodePoolArrayOutput {
	return o
}

func (o NodePoolArrayOutput) ToNodePoolArrayOutputWithContext(ctx context.Context) NodePoolArrayOutput {
	return o
}

func (o NodePoolArrayOutput) Index(i pulumi.IntInput) NodePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NodePool {
		return vs[0].([]NodePool)[vs[1].(int)]
	}).(NodePoolOutput)
}

type NodePoolMapOutput struct{ *pulumi.OutputState }

func (NodePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NodePool)(nil))
}

func (o NodePoolMapOutput) ToNodePoolMapOutput() NodePoolMapOutput {
	return o
}

func (o NodePoolMapOutput) ToNodePoolMapOutputWithContext(ctx context.Context) NodePoolMapOutput {
	return o
}

func (o NodePoolMapOutput) MapIndex(k pulumi.StringInput) NodePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NodePool {
		return vs[0].(map[string]NodePool)[vs[1].(string)]
	}).(NodePoolOutput)
}

func init() {
	pulumi.RegisterOutputType(NodePoolOutput{})
	pulumi.RegisterOutputType(NodePoolPtrOutput{})
	pulumi.RegisterOutputType(NodePoolArrayOutput{})
	pulumi.RegisterOutputType(NodePoolMapOutput{})
}
