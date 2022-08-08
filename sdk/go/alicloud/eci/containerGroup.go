// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eci

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides ECI Container Group resource.
//
// For information about ECI Container Group and how to use it, see [What is Container Group](https://www.alibabacloud.com/help/en/doc-detail/90341.htm).
//
// > **NOTE:** Available in v1.111.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eci"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := eci.NewContainerGroup(ctx, "example", &eci.ContainerGroupArgs{
// 			ContainerGroupName: pulumi.String("tf-testacc-eci-gruop"),
// 			Cpu:                pulumi.Float64(8),
// 			Memory:             pulumi.Float64(16),
// 			RestartPolicy:      pulumi.String("OnFailure"),
// 			SecurityGroupId:    pulumi.Any(alicloud_security_group.Group.Id),
// 			VswitchId:          pulumi.Any(data.Alicloud_vpcs.Default.Vpcs[0].Vswitch_ids[0]),
// 			Tags: pulumi.AnyMap{
// 				"TF": pulumi.Any("create"),
// 			},
// 			Containers: eci.ContainerGroupContainerArray{
// 				&eci.ContainerGroupContainerArgs{
// 					Image:           pulumi.String("registry-vpc.cn-beijing.aliyuncs.com/eci_open/nginx:alpine"),
// 					Name:            pulumi.String("nginx"),
// 					WorkingDir:      pulumi.String("/tmp/nginx"),
// 					ImagePullPolicy: pulumi.String("IfNotPresent"),
// 					Commands: pulumi.StringArray{
// 						pulumi.String("/bin/sh"),
// 						pulumi.String("-c"),
// 						pulumi.String("sleep 9999"),
// 					},
// 					VolumeMounts: eci.ContainerGroupContainerVolumeMountArray{
// 						&eci.ContainerGroupContainerVolumeMountArgs{
// 							MountPath: pulumi.String("/tmp/test"),
// 							ReadOnly:  pulumi.Bool(false),
// 							Name:      pulumi.String("empty1"),
// 						},
// 					},
// 					Ports: eci.ContainerGroupContainerPortArray{
// 						&eci.ContainerGroupContainerPortArgs{
// 							Port:     pulumi.Int(80),
// 							Protocol: pulumi.String("TCP"),
// 						},
// 					},
// 					EnvironmentVars: eci.ContainerGroupContainerEnvironmentVarArray{
// 						&eci.ContainerGroupContainerEnvironmentVarArgs{
// 							Key:   pulumi.String("test"),
// 							Value: pulumi.String("nginx"),
// 						},
// 					},
// 				},
// 				&eci.ContainerGroupContainerArgs{
// 					Image: pulumi.String("registry-vpc.cn-beijing.aliyuncs.com/eci_open/centos:7"),
// 					Name:  pulumi.String("centos"),
// 					Commands: pulumi.StringArray{
// 						pulumi.String("/bin/sh"),
// 						pulumi.String("-c"),
// 						pulumi.String("sleep 9999"),
// 					},
// 				},
// 			},
// 			InitContainers: eci.ContainerGroupInitContainerArray{
// 				&eci.ContainerGroupInitContainerArgs{
// 					Name:            pulumi.String("init-busybox"),
// 					Image:           pulumi.String("registry-vpc.cn-beijing.aliyuncs.com/eci_open/busybox:1.30"),
// 					ImagePullPolicy: pulumi.String("IfNotPresent"),
// 					Commands: pulumi.StringArray{
// 						pulumi.String("echo"),
// 					},
// 					Args: pulumi.StringArray{
// 						pulumi.String("hello initcontainer"),
// 					},
// 				},
// 			},
// 			Volumes: eci.ContainerGroupVolumeArray{
// 				&eci.ContainerGroupVolumeArgs{
// 					Name: pulumi.String("empty1"),
// 					Type: pulumi.String("EmptyDirVolume"),
// 				},
// 				&eci.ContainerGroupVolumeArgs{
// 					Name: pulumi.String("empty2"),
// 					Type: pulumi.String("EmptyDirVolume"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// ECI Container Group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:eci/containerGroup:ContainerGroup example <container_group_id>
// ```
type ContainerGroup struct {
	pulumi.CustomResourceState

	// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
	AutoCreateEip pulumi.BoolPtrOutput `pulumi:"autoCreateEip"`
	// Specifies whether to automatically match the image cache. Default value: false.
	AutoMatchImageCache pulumi.BoolPtrOutput `pulumi:"autoMatchImageCache"`
	// The name of the container group.
	ContainerGroupName pulumi.StringOutput `pulumi:"containerGroupName"`
	// The list of containers.
	Containers ContainerGroupContainerArrayOutput `pulumi:"containers"`
	// The amount of CPU resources allocated to the container.
	Cpu pulumi.Float64Output `pulumi:"cpu"`
	// The structure of dnsConfig.
	DnsConfig ContainerGroupDnsConfigPtrOutput `pulumi:"dnsConfig"`
	// The security context of the container group.
	EciSecurityContext ContainerGroupEciSecurityContextPtrOutput `pulumi:"eciSecurityContext"`
	// The bandwidth of the EIP. The default value is `5`.
	EipBandwidth pulumi.IntPtrOutput `pulumi:"eipBandwidth"`
	// The ID of the elastic IP address (EIP).
	EipInstanceId pulumi.StringPtrOutput `pulumi:"eipInstanceId"`
	// HostAliases.
	HostAliases ContainerGroupHostAliasArrayOutput `pulumi:"hostAliases"`
	// The image registry credential. The details see Block `imageRegistryCredential`.
	ImageRegistryCredentials ContainerGroupImageRegistryCredentialArrayOutput `pulumi:"imageRegistryCredentials"`
	// The list of initContainers.
	InitContainers ContainerGroupInitContainerArrayOutput `pulumi:"initContainers"`
	// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
	InsecureRegistry pulumi.StringPtrOutput `pulumi:"insecureRegistry"`
	// The type of the ECS instance.
	InstanceType pulumi.StringPtrOutput `pulumi:"instanceType"`
	// (Available in v1.170.0+) The Public IP of the container group.
	InternetIp pulumi.StringOutput `pulumi:"internetIp"`
	// (Available in v1.170.0+) The Private IP of the container group.
	IntranetIp pulumi.StringOutput `pulumi:"intranetIp"`
	// The amount of memory resources allocated to the container.
	Memory pulumi.Float64Output `pulumi:"memory"`
	// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
	PlainHttpRegistry pulumi.StringPtrOutput `pulumi:"plainHttpRegistry"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrOutput `pulumi:"ramRoleName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
	RestartPolicy pulumi.StringOutput `pulumi:"restartPolicy"`
	// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// The status of container group.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The list of volumes.
	Volumes ContainerGroupVolumeArrayOutput `pulumi:"volumes"`
	// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewContainerGroup registers a new resource with the given unique name, arguments, and options.
func NewContainerGroup(ctx *pulumi.Context,
	name string, args *ContainerGroupArgs, opts ...pulumi.ResourceOption) (*ContainerGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ContainerGroupName'")
	}
	if args.Containers == nil {
		return nil, errors.New("invalid value for required argument 'Containers'")
	}
	if args.SecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource ContainerGroup
	err := ctx.RegisterResource("alicloud:eci/containerGroup:ContainerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainerGroup gets an existing ContainerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerGroupState, opts ...pulumi.ResourceOption) (*ContainerGroup, error) {
	var resource ContainerGroup
	err := ctx.ReadResource("alicloud:eci/containerGroup:ContainerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContainerGroup resources.
type containerGroupState struct {
	// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
	AutoCreateEip *bool `pulumi:"autoCreateEip"`
	// Specifies whether to automatically match the image cache. Default value: false.
	AutoMatchImageCache *bool `pulumi:"autoMatchImageCache"`
	// The name of the container group.
	ContainerGroupName *string `pulumi:"containerGroupName"`
	// The list of containers.
	Containers []ContainerGroupContainer `pulumi:"containers"`
	// The amount of CPU resources allocated to the container.
	Cpu *float64 `pulumi:"cpu"`
	// The structure of dnsConfig.
	DnsConfig *ContainerGroupDnsConfig `pulumi:"dnsConfig"`
	// The security context of the container group.
	EciSecurityContext *ContainerGroupEciSecurityContext `pulumi:"eciSecurityContext"`
	// The bandwidth of the EIP. The default value is `5`.
	EipBandwidth *int `pulumi:"eipBandwidth"`
	// The ID of the elastic IP address (EIP).
	EipInstanceId *string `pulumi:"eipInstanceId"`
	// HostAliases.
	HostAliases []ContainerGroupHostAlias `pulumi:"hostAliases"`
	// The image registry credential. The details see Block `imageRegistryCredential`.
	ImageRegistryCredentials []ContainerGroupImageRegistryCredential `pulumi:"imageRegistryCredentials"`
	// The list of initContainers.
	InitContainers []ContainerGroupInitContainer `pulumi:"initContainers"`
	// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
	InsecureRegistry *string `pulumi:"insecureRegistry"`
	// The type of the ECS instance.
	InstanceType *string `pulumi:"instanceType"`
	// (Available in v1.170.0+) The Public IP of the container group.
	InternetIp *string `pulumi:"internetIp"`
	// (Available in v1.170.0+) The Private IP of the container group.
	IntranetIp *string `pulumi:"intranetIp"`
	// The amount of memory resources allocated to the container.
	Memory *float64 `pulumi:"memory"`
	// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
	PlainHttpRegistry *string `pulumi:"plainHttpRegistry"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
	RestartPolicy *string `pulumi:"restartPolicy"`
	// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The status of container group.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The list of volumes.
	Volumes []ContainerGroupVolume `pulumi:"volumes"`
	// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
	VswitchId *string `pulumi:"vswitchId"`
	// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
	ZoneId *string `pulumi:"zoneId"`
}

type ContainerGroupState struct {
	// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
	AutoCreateEip pulumi.BoolPtrInput
	// Specifies whether to automatically match the image cache. Default value: false.
	AutoMatchImageCache pulumi.BoolPtrInput
	// The name of the container group.
	ContainerGroupName pulumi.StringPtrInput
	// The list of containers.
	Containers ContainerGroupContainerArrayInput
	// The amount of CPU resources allocated to the container.
	Cpu pulumi.Float64PtrInput
	// The structure of dnsConfig.
	DnsConfig ContainerGroupDnsConfigPtrInput
	// The security context of the container group.
	EciSecurityContext ContainerGroupEciSecurityContextPtrInput
	// The bandwidth of the EIP. The default value is `5`.
	EipBandwidth pulumi.IntPtrInput
	// The ID of the elastic IP address (EIP).
	EipInstanceId pulumi.StringPtrInput
	// HostAliases.
	HostAliases ContainerGroupHostAliasArrayInput
	// The image registry credential. The details see Block `imageRegistryCredential`.
	ImageRegistryCredentials ContainerGroupImageRegistryCredentialArrayInput
	// The list of initContainers.
	InitContainers ContainerGroupInitContainerArrayInput
	// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
	InsecureRegistry pulumi.StringPtrInput
	// The type of the ECS instance.
	InstanceType pulumi.StringPtrInput
	// (Available in v1.170.0+) The Public IP of the container group.
	InternetIp pulumi.StringPtrInput
	// (Available in v1.170.0+) The Private IP of the container group.
	IntranetIp pulumi.StringPtrInput
	// The amount of memory resources allocated to the container.
	Memory pulumi.Float64PtrInput
	// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
	PlainHttpRegistry pulumi.StringPtrInput
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
	RestartPolicy pulumi.StringPtrInput
	// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
	SecurityGroupId pulumi.StringPtrInput
	// The status of container group.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The list of volumes.
	Volumes ContainerGroupVolumeArrayInput
	// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
	VswitchId pulumi.StringPtrInput
	// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
	ZoneId pulumi.StringPtrInput
}

func (ContainerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerGroupState)(nil)).Elem()
}

type containerGroupArgs struct {
	// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
	AutoCreateEip *bool `pulumi:"autoCreateEip"`
	// Specifies whether to automatically match the image cache. Default value: false.
	AutoMatchImageCache *bool `pulumi:"autoMatchImageCache"`
	// The name of the container group.
	ContainerGroupName string `pulumi:"containerGroupName"`
	// The list of containers.
	Containers []ContainerGroupContainer `pulumi:"containers"`
	// The amount of CPU resources allocated to the container.
	Cpu *float64 `pulumi:"cpu"`
	// The structure of dnsConfig.
	DnsConfig *ContainerGroupDnsConfig `pulumi:"dnsConfig"`
	// The security context of the container group.
	EciSecurityContext *ContainerGroupEciSecurityContext `pulumi:"eciSecurityContext"`
	// The bandwidth of the EIP. The default value is `5`.
	EipBandwidth *int `pulumi:"eipBandwidth"`
	// The ID of the elastic IP address (EIP).
	EipInstanceId *string `pulumi:"eipInstanceId"`
	// HostAliases.
	HostAliases []ContainerGroupHostAlias `pulumi:"hostAliases"`
	// The image registry credential. The details see Block `imageRegistryCredential`.
	ImageRegistryCredentials []ContainerGroupImageRegistryCredential `pulumi:"imageRegistryCredentials"`
	// The list of initContainers.
	InitContainers []ContainerGroupInitContainer `pulumi:"initContainers"`
	// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
	InsecureRegistry *string `pulumi:"insecureRegistry"`
	// The type of the ECS instance.
	InstanceType *string `pulumi:"instanceType"`
	// The amount of memory resources allocated to the container.
	Memory *float64 `pulumi:"memory"`
	// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
	PlainHttpRegistry *string `pulumi:"plainHttpRegistry"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
	RestartPolicy *string `pulumi:"restartPolicy"`
	// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
	SecurityGroupId string `pulumi:"securityGroupId"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The list of volumes.
	Volumes []ContainerGroupVolume `pulumi:"volumes"`
	// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
	VswitchId string `pulumi:"vswitchId"`
	// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ContainerGroup resource.
type ContainerGroupArgs struct {
	// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
	AutoCreateEip pulumi.BoolPtrInput
	// Specifies whether to automatically match the image cache. Default value: false.
	AutoMatchImageCache pulumi.BoolPtrInput
	// The name of the container group.
	ContainerGroupName pulumi.StringInput
	// The list of containers.
	Containers ContainerGroupContainerArrayInput
	// The amount of CPU resources allocated to the container.
	Cpu pulumi.Float64PtrInput
	// The structure of dnsConfig.
	DnsConfig ContainerGroupDnsConfigPtrInput
	// The security context of the container group.
	EciSecurityContext ContainerGroupEciSecurityContextPtrInput
	// The bandwidth of the EIP. The default value is `5`.
	EipBandwidth pulumi.IntPtrInput
	// The ID of the elastic IP address (EIP).
	EipInstanceId pulumi.StringPtrInput
	// HostAliases.
	HostAliases ContainerGroupHostAliasArrayInput
	// The image registry credential. The details see Block `imageRegistryCredential`.
	ImageRegistryCredentials ContainerGroupImageRegistryCredentialArrayInput
	// The list of initContainers.
	InitContainers ContainerGroupInitContainerArrayInput
	// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
	InsecureRegistry pulumi.StringPtrInput
	// The type of the ECS instance.
	InstanceType pulumi.StringPtrInput
	// The amount of memory resources allocated to the container.
	Memory pulumi.Float64PtrInput
	// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
	PlainHttpRegistry pulumi.StringPtrInput
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
	RestartPolicy pulumi.StringPtrInput
	// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
	SecurityGroupId pulumi.StringInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The list of volumes.
	Volumes ContainerGroupVolumeArrayInput
	// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
	VswitchId pulumi.StringInput
	// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
	ZoneId pulumi.StringPtrInput
}

func (ContainerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerGroupArgs)(nil)).Elem()
}

type ContainerGroupInput interface {
	pulumi.Input

	ToContainerGroupOutput() ContainerGroupOutput
	ToContainerGroupOutputWithContext(ctx context.Context) ContainerGroupOutput
}

func (*ContainerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerGroup)(nil)).Elem()
}

func (i *ContainerGroup) ToContainerGroupOutput() ContainerGroupOutput {
	return i.ToContainerGroupOutputWithContext(context.Background())
}

func (i *ContainerGroup) ToContainerGroupOutputWithContext(ctx context.Context) ContainerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerGroupOutput)
}

// ContainerGroupArrayInput is an input type that accepts ContainerGroupArray and ContainerGroupArrayOutput values.
// You can construct a concrete instance of `ContainerGroupArrayInput` via:
//
//          ContainerGroupArray{ ContainerGroupArgs{...} }
type ContainerGroupArrayInput interface {
	pulumi.Input

	ToContainerGroupArrayOutput() ContainerGroupArrayOutput
	ToContainerGroupArrayOutputWithContext(context.Context) ContainerGroupArrayOutput
}

type ContainerGroupArray []ContainerGroupInput

func (ContainerGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerGroup)(nil)).Elem()
}

func (i ContainerGroupArray) ToContainerGroupArrayOutput() ContainerGroupArrayOutput {
	return i.ToContainerGroupArrayOutputWithContext(context.Background())
}

func (i ContainerGroupArray) ToContainerGroupArrayOutputWithContext(ctx context.Context) ContainerGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerGroupArrayOutput)
}

// ContainerGroupMapInput is an input type that accepts ContainerGroupMap and ContainerGroupMapOutput values.
// You can construct a concrete instance of `ContainerGroupMapInput` via:
//
//          ContainerGroupMap{ "key": ContainerGroupArgs{...} }
type ContainerGroupMapInput interface {
	pulumi.Input

	ToContainerGroupMapOutput() ContainerGroupMapOutput
	ToContainerGroupMapOutputWithContext(context.Context) ContainerGroupMapOutput
}

type ContainerGroupMap map[string]ContainerGroupInput

func (ContainerGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerGroup)(nil)).Elem()
}

func (i ContainerGroupMap) ToContainerGroupMapOutput() ContainerGroupMapOutput {
	return i.ToContainerGroupMapOutputWithContext(context.Background())
}

func (i ContainerGroupMap) ToContainerGroupMapOutputWithContext(ctx context.Context) ContainerGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerGroupMapOutput)
}

type ContainerGroupOutput struct{ *pulumi.OutputState }

func (ContainerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerGroup)(nil)).Elem()
}

func (o ContainerGroupOutput) ToContainerGroupOutput() ContainerGroupOutput {
	return o
}

func (o ContainerGroupOutput) ToContainerGroupOutputWithContext(ctx context.Context) ContainerGroupOutput {
	return o
}

// Specifies whether to automatically create an EIP and bind the EIP to the elastic container instance.
func (o ContainerGroupOutput) AutoCreateEip() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.BoolPtrOutput { return v.AutoCreateEip }).(pulumi.BoolPtrOutput)
}

// Specifies whether to automatically match the image cache. Default value: false.
func (o ContainerGroupOutput) AutoMatchImageCache() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.BoolPtrOutput { return v.AutoMatchImageCache }).(pulumi.BoolPtrOutput)
}

// The name of the container group.
func (o ContainerGroupOutput) ContainerGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.ContainerGroupName }).(pulumi.StringOutput)
}

// The list of containers.
func (o ContainerGroupOutput) Containers() ContainerGroupContainerArrayOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupContainerArrayOutput { return v.Containers }).(ContainerGroupContainerArrayOutput)
}

// The amount of CPU resources allocated to the container.
func (o ContainerGroupOutput) Cpu() pulumi.Float64Output {
	return o.ApplyT(func(v *ContainerGroup) pulumi.Float64Output { return v.Cpu }).(pulumi.Float64Output)
}

// The structure of dnsConfig.
func (o ContainerGroupOutput) DnsConfig() ContainerGroupDnsConfigPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupDnsConfigPtrOutput { return v.DnsConfig }).(ContainerGroupDnsConfigPtrOutput)
}

// The security context of the container group.
func (o ContainerGroupOutput) EciSecurityContext() ContainerGroupEciSecurityContextPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupEciSecurityContextPtrOutput { return v.EciSecurityContext }).(ContainerGroupEciSecurityContextPtrOutput)
}

// The bandwidth of the EIP. The default value is `5`.
func (o ContainerGroupOutput) EipBandwidth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.IntPtrOutput { return v.EipBandwidth }).(pulumi.IntPtrOutput)
}

// The ID of the elastic IP address (EIP).
func (o ContainerGroupOutput) EipInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringPtrOutput { return v.EipInstanceId }).(pulumi.StringPtrOutput)
}

// HostAliases.
func (o ContainerGroupOutput) HostAliases() ContainerGroupHostAliasArrayOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupHostAliasArrayOutput { return v.HostAliases }).(ContainerGroupHostAliasArrayOutput)
}

// The image registry credential. The details see Block `imageRegistryCredential`.
func (o ContainerGroupOutput) ImageRegistryCredentials() ContainerGroupImageRegistryCredentialArrayOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupImageRegistryCredentialArrayOutput {
		return v.ImageRegistryCredentials
	}).(ContainerGroupImageRegistryCredentialArrayOutput)
}

// The list of initContainers.
func (o ContainerGroupOutput) InitContainers() ContainerGroupInitContainerArrayOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupInitContainerArrayOutput { return v.InitContainers }).(ContainerGroupInitContainerArrayOutput)
}

// The address of the self-built mirror warehouse. When creating an image cache using an image in a self-built image repository with a self-signed certificate, you need to configure this parameter to skip certificate authentication to avoid image pull failure due to certificate authentication failure.
func (o ContainerGroupOutput) InsecureRegistry() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringPtrOutput { return v.InsecureRegistry }).(pulumi.StringPtrOutput)
}

// The type of the ECS instance.
func (o ContainerGroupOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringPtrOutput { return v.InstanceType }).(pulumi.StringPtrOutput)
}

// (Available in v1.170.0+) The Public IP of the container group.
func (o ContainerGroupOutput) InternetIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.InternetIp }).(pulumi.StringOutput)
}

// (Available in v1.170.0+) The Private IP of the container group.
func (o ContainerGroupOutput) IntranetIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.IntranetIp }).(pulumi.StringOutput)
}

// The amount of memory resources allocated to the container.
func (o ContainerGroupOutput) Memory() pulumi.Float64Output {
	return o.ApplyT(func(v *ContainerGroup) pulumi.Float64Output { return v.Memory }).(pulumi.Float64Output)
}

// The address of the self-built mirror warehouse. When creating an image cache from an image in a self-built image repository using the HTTP protocol, you need to configure this parameter so that the ECI uses the HTTP protocol to pull the image to avoid image pull failure due to different protocols.
func (o ContainerGroupOutput) PlainHttpRegistry() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringPtrOutput { return v.PlainHttpRegistry }).(pulumi.StringPtrOutput)
}

// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
func (o ContainerGroupOutput) RamRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringPtrOutput { return v.RamRoleName }).(pulumi.StringPtrOutput)
}

// The ID of the resource group.
func (o ContainerGroupOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The restart policy of the container group. Valid values: `Always`, `Never`, `OnFailure`.
func (o ContainerGroupOutput) RestartPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.RestartPolicy }).(pulumi.StringOutput)
}

// The ID of the security group to which the container group belongs. Container groups within the same security group can access each other.
func (o ContainerGroupOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

// The status of container group.
func (o ContainerGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
func (o ContainerGroupOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The list of volumes.
func (o ContainerGroupOutput) Volumes() ContainerGroupVolumeArrayOutput {
	return o.ApplyT(func(v *ContainerGroup) ContainerGroupVolumeArrayOutput { return v.Volumes }).(ContainerGroupVolumeArrayOutput)
}

// The ID of the VSwitch. Currently, container groups can only be deployed in VPC networks. The number of IP addresses in the VSwitch CIDR block determines the maximum number of container groups that can be created in the VSwitch. Before you can create an ECI instance, plan the CIDR block of the VSwitch.
func (o ContainerGroupOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

// The ID of the zone where you want to deploy the container group. If no value is specified, the system assigns a zone to the container group. By default, no value is specified.
func (o ContainerGroupOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerGroup) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ContainerGroupArrayOutput struct{ *pulumi.OutputState }

func (ContainerGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerGroup)(nil)).Elem()
}

func (o ContainerGroupArrayOutput) ToContainerGroupArrayOutput() ContainerGroupArrayOutput {
	return o
}

func (o ContainerGroupArrayOutput) ToContainerGroupArrayOutputWithContext(ctx context.Context) ContainerGroupArrayOutput {
	return o
}

func (o ContainerGroupArrayOutput) Index(i pulumi.IntInput) ContainerGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContainerGroup {
		return vs[0].([]*ContainerGroup)[vs[1].(int)]
	}).(ContainerGroupOutput)
}

type ContainerGroupMapOutput struct{ *pulumi.OutputState }

func (ContainerGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerGroup)(nil)).Elem()
}

func (o ContainerGroupMapOutput) ToContainerGroupMapOutput() ContainerGroupMapOutput {
	return o
}

func (o ContainerGroupMapOutput) ToContainerGroupMapOutputWithContext(ctx context.Context) ContainerGroupMapOutput {
	return o
}

func (o ContainerGroupMapOutput) MapIndex(k pulumi.StringInput) ContainerGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContainerGroup {
		return vs[0].(map[string]*ContainerGroup)[vs[1].(string)]
	}).(ContainerGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerGroupInput)(nil)).Elem(), &ContainerGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerGroupArrayInput)(nil)).Elem(), ContainerGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerGroupMapInput)(nil)).Elem(), ContainerGroupMap{})
	pulumi.RegisterOutputType(ContainerGroupOutput{})
	pulumi.RegisterOutputType(ContainerGroupArrayOutput{})
	pulumi.RegisterOutputType(ContainerGroupMapOutput{})
}
