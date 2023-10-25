// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a ESS eci scaling configuration resource.
//
// For information about ess eci scaling configuration, see [CreateEciScalingConfiguration](https://www.alibabacloud.com/help/en/auto-scaling/latest/create-eci-scaling-configuration).
//
// > **NOTE:** Available since v1.164.0.
//
// ## Import
//
// ESS eci scaling configuration can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ess/eciScalingConfiguration:EciScalingConfiguration example asc-abc123456
//
// ```
type EciScalingConfiguration struct {
	pulumi.CustomResourceState

	// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
	AcrRegistryInfos EciScalingConfigurationAcrRegistryInfoArrayOutput `pulumi:"acrRegistryInfos"`
	// Whether active current eci scaling configuration in the specified scaling group. Note that only
	// one configuration can be active. Default to `false`.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// Whether create eip automatically.
	AutoCreateEip pulumi.BoolPtrOutput `pulumi:"autoCreateEip"`
	// The name of the container group.
	ContainerGroupName pulumi.StringPtrOutput `pulumi:"containerGroupName"`
	// The list of containers. See `containers` below for details.
	Containers EciScalingConfigurationContainerArrayOutput `pulumi:"containers"`
	// The amount of CPU resources allocated to the container group.
	Cpu pulumi.Float64PtrOutput `pulumi:"cpu"`
	// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
	// 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// dns policy of contain group.
	DnsPolicy pulumi.StringPtrOutput `pulumi:"dnsPolicy"`
	// egress bandwidth.
	EgressBandwidth pulumi.IntPtrOutput `pulumi:"egressBandwidth"`
	// Eip bandwidth.
	EipBandwidth pulumi.IntPtrOutput `pulumi:"eipBandwidth"`
	// Enable sls log service.
	EnableSls pulumi.BoolPtrOutput `pulumi:"enableSls"`
	// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
	// Default to false.
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// HostAliases. See `hostAliases` below.
	HostAliases EciScalingConfigurationHostAliasArrayOutput `pulumi:"hostAliases"`
	// Hostname of an ECI instance.
	HostName pulumi.StringPtrOutput `pulumi:"hostName"`
	// The image registry credential.   See `imageRegistryCredentials` below for
	// details.
	ImageRegistryCredentials EciScalingConfigurationImageRegistryCredentialArrayOutput `pulumi:"imageRegistryCredentials"`
	// Ingress bandwidth.
	IngressBandwidth pulumi.IntPtrOutput `pulumi:"ingressBandwidth"`
	// The list of initContainers. See `initContainers` below for details.
	InitContainers EciScalingConfigurationInitContainerArrayOutput `pulumi:"initContainers"`
	// The amount of memory resources allocated to the container group.
	Memory pulumi.Float64PtrOutput `pulumi:"memory"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrOutput `pulumi:"ramRoleName"`
	// ID of resource group.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Default to `Always`.
	RestartPolicy pulumi.StringPtrOutput `pulumi:"restartPolicy"`
	// Name shown for the scheduled task. which must contain 2-64 characters (
	// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
	// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
	// EciScalingConfigurationId.
	ScalingConfigurationName pulumi.StringOutput `pulumi:"scalingConfigurationName"`
	// ID of the scaling group of a eci scaling configuration.
	ScalingGroupId pulumi.StringOutput `pulumi:"scalingGroupId"`
	// ID of the security group used to create new instance. It is conflict
	// with `securityGroupIds`.
	SecurityGroupId pulumi.StringPtrOutput `pulumi:"securityGroupId"`
	// The maximum price hourly for spot instance.
	SpotPriceLimit pulumi.Float64PtrOutput `pulumi:"spotPriceLimit"`
	// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
	// , `SpotWithPriceLimit`.
	SpotStrategy pulumi.StringPtrOutput `pulumi:"spotStrategy"`
	// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
	//   be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
	//   a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The list of volumes. See `volumes` below for details.
	Volumes EciScalingConfigurationVolumeArrayOutput `pulumi:"volumes"`
}

// NewEciScalingConfiguration registers a new resource with the given unique name, arguments, and options.
func NewEciScalingConfiguration(ctx *pulumi.Context,
	name string, args *EciScalingConfigurationArgs, opts ...pulumi.ResourceOption) (*EciScalingConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ScalingGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ScalingGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EciScalingConfiguration
	err := ctx.RegisterResource("alicloud:ess/eciScalingConfiguration:EciScalingConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEciScalingConfiguration gets an existing EciScalingConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEciScalingConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EciScalingConfigurationState, opts ...pulumi.ResourceOption) (*EciScalingConfiguration, error) {
	var resource EciScalingConfiguration
	err := ctx.ReadResource("alicloud:ess/eciScalingConfiguration:EciScalingConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EciScalingConfiguration resources.
type eciScalingConfigurationState struct {
	// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
	AcrRegistryInfos []EciScalingConfigurationAcrRegistryInfo `pulumi:"acrRegistryInfos"`
	// Whether active current eci scaling configuration in the specified scaling group. Note that only
	// one configuration can be active. Default to `false`.
	Active *bool `pulumi:"active"`
	// Whether create eip automatically.
	AutoCreateEip *bool `pulumi:"autoCreateEip"`
	// The name of the container group.
	ContainerGroupName *string `pulumi:"containerGroupName"`
	// The list of containers. See `containers` below for details.
	Containers []EciScalingConfigurationContainer `pulumi:"containers"`
	// The amount of CPU resources allocated to the container group.
	Cpu *float64 `pulumi:"cpu"`
	// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
	// 256 characters in length and cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// dns policy of contain group.
	DnsPolicy *string `pulumi:"dnsPolicy"`
	// egress bandwidth.
	EgressBandwidth *int `pulumi:"egressBandwidth"`
	// Eip bandwidth.
	EipBandwidth *int `pulumi:"eipBandwidth"`
	// Enable sls log service.
	EnableSls *bool `pulumi:"enableSls"`
	// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
	// Default to false.
	ForceDelete *bool `pulumi:"forceDelete"`
	// HostAliases. See `hostAliases` below.
	HostAliases []EciScalingConfigurationHostAlias `pulumi:"hostAliases"`
	// Hostname of an ECI instance.
	HostName *string `pulumi:"hostName"`
	// The image registry credential.   See `imageRegistryCredentials` below for
	// details.
	ImageRegistryCredentials []EciScalingConfigurationImageRegistryCredential `pulumi:"imageRegistryCredentials"`
	// Ingress bandwidth.
	IngressBandwidth *int `pulumi:"ingressBandwidth"`
	// The list of initContainers. See `initContainers` below for details.
	InitContainers []EciScalingConfigurationInitContainer `pulumi:"initContainers"`
	// The amount of memory resources allocated to the container group.
	Memory *float64 `pulumi:"memory"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// ID of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Default to `Always`.
	RestartPolicy *string `pulumi:"restartPolicy"`
	// Name shown for the scheduled task. which must contain 2-64 characters (
	// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
	// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
	// EciScalingConfigurationId.
	ScalingConfigurationName *string `pulumi:"scalingConfigurationName"`
	// ID of the scaling group of a eci scaling configuration.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
	// ID of the security group used to create new instance. It is conflict
	// with `securityGroupIds`.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The maximum price hourly for spot instance.
	SpotPriceLimit *float64 `pulumi:"spotPriceLimit"`
	// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
	// , `SpotWithPriceLimit`.
	SpotStrategy *string `pulumi:"spotStrategy"`
	// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
	//   be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
	//   a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The list of volumes. See `volumes` below for details.
	Volumes []EciScalingConfigurationVolume `pulumi:"volumes"`
}

type EciScalingConfigurationState struct {
	// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
	AcrRegistryInfos EciScalingConfigurationAcrRegistryInfoArrayInput
	// Whether active current eci scaling configuration in the specified scaling group. Note that only
	// one configuration can be active. Default to `false`.
	Active pulumi.BoolPtrInput
	// Whether create eip automatically.
	AutoCreateEip pulumi.BoolPtrInput
	// The name of the container group.
	ContainerGroupName pulumi.StringPtrInput
	// The list of containers. See `containers` below for details.
	Containers EciScalingConfigurationContainerArrayInput
	// The amount of CPU resources allocated to the container group.
	Cpu pulumi.Float64PtrInput
	// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
	// 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// dns policy of contain group.
	DnsPolicy pulumi.StringPtrInput
	// egress bandwidth.
	EgressBandwidth pulumi.IntPtrInput
	// Eip bandwidth.
	EipBandwidth pulumi.IntPtrInput
	// Enable sls log service.
	EnableSls pulumi.BoolPtrInput
	// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
	// Default to false.
	ForceDelete pulumi.BoolPtrInput
	// HostAliases. See `hostAliases` below.
	HostAliases EciScalingConfigurationHostAliasArrayInput
	// Hostname of an ECI instance.
	HostName pulumi.StringPtrInput
	// The image registry credential.   See `imageRegistryCredentials` below for
	// details.
	ImageRegistryCredentials EciScalingConfigurationImageRegistryCredentialArrayInput
	// Ingress bandwidth.
	IngressBandwidth pulumi.IntPtrInput
	// The list of initContainers. See `initContainers` below for details.
	InitContainers EciScalingConfigurationInitContainerArrayInput
	// The amount of memory resources allocated to the container group.
	Memory pulumi.Float64PtrInput
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrInput
	// ID of resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The restart policy of the container group. Default to `Always`.
	RestartPolicy pulumi.StringPtrInput
	// Name shown for the scheduled task. which must contain 2-64 characters (
	// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
	// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
	// EciScalingConfigurationId.
	ScalingConfigurationName pulumi.StringPtrInput
	// ID of the scaling group of a eci scaling configuration.
	ScalingGroupId pulumi.StringPtrInput
	// ID of the security group used to create new instance. It is conflict
	// with `securityGroupIds`.
	SecurityGroupId pulumi.StringPtrInput
	// The maximum price hourly for spot instance.
	SpotPriceLimit pulumi.Float64PtrInput
	// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
	// , `SpotWithPriceLimit`.
	SpotStrategy pulumi.StringPtrInput
	// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
	//   be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
	//   a null string.
	Tags pulumi.MapInput
	// The list of volumes. See `volumes` below for details.
	Volumes EciScalingConfigurationVolumeArrayInput
}

func (EciScalingConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*eciScalingConfigurationState)(nil)).Elem()
}

type eciScalingConfigurationArgs struct {
	// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
	AcrRegistryInfos []EciScalingConfigurationAcrRegistryInfo `pulumi:"acrRegistryInfos"`
	// Whether active current eci scaling configuration in the specified scaling group. Note that only
	// one configuration can be active. Default to `false`.
	Active *bool `pulumi:"active"`
	// Whether create eip automatically.
	AutoCreateEip *bool `pulumi:"autoCreateEip"`
	// The name of the container group.
	ContainerGroupName *string `pulumi:"containerGroupName"`
	// The list of containers. See `containers` below for details.
	Containers []EciScalingConfigurationContainer `pulumi:"containers"`
	// The amount of CPU resources allocated to the container group.
	Cpu *float64 `pulumi:"cpu"`
	// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
	// 256 characters in length and cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// dns policy of contain group.
	DnsPolicy *string `pulumi:"dnsPolicy"`
	// egress bandwidth.
	EgressBandwidth *int `pulumi:"egressBandwidth"`
	// Eip bandwidth.
	EipBandwidth *int `pulumi:"eipBandwidth"`
	// Enable sls log service.
	EnableSls *bool `pulumi:"enableSls"`
	// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
	// Default to false.
	ForceDelete *bool `pulumi:"forceDelete"`
	// HostAliases. See `hostAliases` below.
	HostAliases []EciScalingConfigurationHostAlias `pulumi:"hostAliases"`
	// Hostname of an ECI instance.
	HostName *string `pulumi:"hostName"`
	// The image registry credential.   See `imageRegistryCredentials` below for
	// details.
	ImageRegistryCredentials []EciScalingConfigurationImageRegistryCredential `pulumi:"imageRegistryCredentials"`
	// Ingress bandwidth.
	IngressBandwidth *int `pulumi:"ingressBandwidth"`
	// The list of initContainers. See `initContainers` below for details.
	InitContainers []EciScalingConfigurationInitContainer `pulumi:"initContainers"`
	// The amount of memory resources allocated to the container group.
	Memory *float64 `pulumi:"memory"`
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// ID of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The restart policy of the container group. Default to `Always`.
	RestartPolicy *string `pulumi:"restartPolicy"`
	// Name shown for the scheduled task. which must contain 2-64 characters (
	// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
	// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
	// EciScalingConfigurationId.
	ScalingConfigurationName *string `pulumi:"scalingConfigurationName"`
	// ID of the scaling group of a eci scaling configuration.
	ScalingGroupId string `pulumi:"scalingGroupId"`
	// ID of the security group used to create new instance. It is conflict
	// with `securityGroupIds`.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The maximum price hourly for spot instance.
	SpotPriceLimit *float64 `pulumi:"spotPriceLimit"`
	// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
	// , `SpotWithPriceLimit`.
	SpotStrategy *string `pulumi:"spotStrategy"`
	// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
	//   be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
	//   a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The list of volumes. See `volumes` below for details.
	Volumes []EciScalingConfigurationVolume `pulumi:"volumes"`
}

// The set of arguments for constructing a EciScalingConfiguration resource.
type EciScalingConfigurationArgs struct {
	// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
	AcrRegistryInfos EciScalingConfigurationAcrRegistryInfoArrayInput
	// Whether active current eci scaling configuration in the specified scaling group. Note that only
	// one configuration can be active. Default to `false`.
	Active pulumi.BoolPtrInput
	// Whether create eip automatically.
	AutoCreateEip pulumi.BoolPtrInput
	// The name of the container group.
	ContainerGroupName pulumi.StringPtrInput
	// The list of containers. See `containers` below for details.
	Containers EciScalingConfigurationContainerArrayInput
	// The amount of CPU resources allocated to the container group.
	Cpu pulumi.Float64PtrInput
	// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
	// 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// dns policy of contain group.
	DnsPolicy pulumi.StringPtrInput
	// egress bandwidth.
	EgressBandwidth pulumi.IntPtrInput
	// Eip bandwidth.
	EipBandwidth pulumi.IntPtrInput
	// Enable sls log service.
	EnableSls pulumi.BoolPtrInput
	// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
	// Default to false.
	ForceDelete pulumi.BoolPtrInput
	// HostAliases. See `hostAliases` below.
	HostAliases EciScalingConfigurationHostAliasArrayInput
	// Hostname of an ECI instance.
	HostName pulumi.StringPtrInput
	// The image registry credential.   See `imageRegistryCredentials` below for
	// details.
	ImageRegistryCredentials EciScalingConfigurationImageRegistryCredentialArrayInput
	// Ingress bandwidth.
	IngressBandwidth pulumi.IntPtrInput
	// The list of initContainers. See `initContainers` below for details.
	InitContainers EciScalingConfigurationInitContainerArrayInput
	// The amount of memory resources allocated to the container group.
	Memory pulumi.Float64PtrInput
	// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
	RamRoleName pulumi.StringPtrInput
	// ID of resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The restart policy of the container group. Default to `Always`.
	RestartPolicy pulumi.StringPtrInput
	// Name shown for the scheduled task. which must contain 2-64 characters (
	// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
	// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
	// EciScalingConfigurationId.
	ScalingConfigurationName pulumi.StringPtrInput
	// ID of the scaling group of a eci scaling configuration.
	ScalingGroupId pulumi.StringInput
	// ID of the security group used to create new instance. It is conflict
	// with `securityGroupIds`.
	SecurityGroupId pulumi.StringPtrInput
	// The maximum price hourly for spot instance.
	SpotPriceLimit pulumi.Float64PtrInput
	// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
	// , `SpotWithPriceLimit`.
	SpotStrategy pulumi.StringPtrInput
	// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
	//   be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
	//   a null string.
	Tags pulumi.MapInput
	// The list of volumes. See `volumes` below for details.
	Volumes EciScalingConfigurationVolumeArrayInput
}

func (EciScalingConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eciScalingConfigurationArgs)(nil)).Elem()
}

type EciScalingConfigurationInput interface {
	pulumi.Input

	ToEciScalingConfigurationOutput() EciScalingConfigurationOutput
	ToEciScalingConfigurationOutputWithContext(ctx context.Context) EciScalingConfigurationOutput
}

func (*EciScalingConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**EciScalingConfiguration)(nil)).Elem()
}

func (i *EciScalingConfiguration) ToEciScalingConfigurationOutput() EciScalingConfigurationOutput {
	return i.ToEciScalingConfigurationOutputWithContext(context.Background())
}

func (i *EciScalingConfiguration) ToEciScalingConfigurationOutputWithContext(ctx context.Context) EciScalingConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EciScalingConfigurationOutput)
}

func (i *EciScalingConfiguration) ToOutput(ctx context.Context) pulumix.Output[*EciScalingConfiguration] {
	return pulumix.Output[*EciScalingConfiguration]{
		OutputState: i.ToEciScalingConfigurationOutputWithContext(ctx).OutputState,
	}
}

// EciScalingConfigurationArrayInput is an input type that accepts EciScalingConfigurationArray and EciScalingConfigurationArrayOutput values.
// You can construct a concrete instance of `EciScalingConfigurationArrayInput` via:
//
//	EciScalingConfigurationArray{ EciScalingConfigurationArgs{...} }
type EciScalingConfigurationArrayInput interface {
	pulumi.Input

	ToEciScalingConfigurationArrayOutput() EciScalingConfigurationArrayOutput
	ToEciScalingConfigurationArrayOutputWithContext(context.Context) EciScalingConfigurationArrayOutput
}

type EciScalingConfigurationArray []EciScalingConfigurationInput

func (EciScalingConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EciScalingConfiguration)(nil)).Elem()
}

func (i EciScalingConfigurationArray) ToEciScalingConfigurationArrayOutput() EciScalingConfigurationArrayOutput {
	return i.ToEciScalingConfigurationArrayOutputWithContext(context.Background())
}

func (i EciScalingConfigurationArray) ToEciScalingConfigurationArrayOutputWithContext(ctx context.Context) EciScalingConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EciScalingConfigurationArrayOutput)
}

func (i EciScalingConfigurationArray) ToOutput(ctx context.Context) pulumix.Output[[]*EciScalingConfiguration] {
	return pulumix.Output[[]*EciScalingConfiguration]{
		OutputState: i.ToEciScalingConfigurationArrayOutputWithContext(ctx).OutputState,
	}
}

// EciScalingConfigurationMapInput is an input type that accepts EciScalingConfigurationMap and EciScalingConfigurationMapOutput values.
// You can construct a concrete instance of `EciScalingConfigurationMapInput` via:
//
//	EciScalingConfigurationMap{ "key": EciScalingConfigurationArgs{...} }
type EciScalingConfigurationMapInput interface {
	pulumi.Input

	ToEciScalingConfigurationMapOutput() EciScalingConfigurationMapOutput
	ToEciScalingConfigurationMapOutputWithContext(context.Context) EciScalingConfigurationMapOutput
}

type EciScalingConfigurationMap map[string]EciScalingConfigurationInput

func (EciScalingConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EciScalingConfiguration)(nil)).Elem()
}

func (i EciScalingConfigurationMap) ToEciScalingConfigurationMapOutput() EciScalingConfigurationMapOutput {
	return i.ToEciScalingConfigurationMapOutputWithContext(context.Background())
}

func (i EciScalingConfigurationMap) ToEciScalingConfigurationMapOutputWithContext(ctx context.Context) EciScalingConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EciScalingConfigurationMapOutput)
}

func (i EciScalingConfigurationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EciScalingConfiguration] {
	return pulumix.Output[map[string]*EciScalingConfiguration]{
		OutputState: i.ToEciScalingConfigurationMapOutputWithContext(ctx).OutputState,
	}
}

type EciScalingConfigurationOutput struct{ *pulumi.OutputState }

func (EciScalingConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EciScalingConfiguration)(nil)).Elem()
}

func (o EciScalingConfigurationOutput) ToEciScalingConfigurationOutput() EciScalingConfigurationOutput {
	return o
}

func (o EciScalingConfigurationOutput) ToEciScalingConfigurationOutputWithContext(ctx context.Context) EciScalingConfigurationOutput {
	return o
}

func (o EciScalingConfigurationOutput) ToOutput(ctx context.Context) pulumix.Output[*EciScalingConfiguration] {
	return pulumix.Output[*EciScalingConfiguration]{
		OutputState: o.OutputState,
	}
}

// Information about the Container Registry Enterprise Edition instance. See `acrRegistryInfos` below for details.
func (o EciScalingConfigurationOutput) AcrRegistryInfos() EciScalingConfigurationAcrRegistryInfoArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationAcrRegistryInfoArrayOutput {
		return v.AcrRegistryInfos
	}).(EciScalingConfigurationAcrRegistryInfoArrayOutput)
}

// Whether active current eci scaling configuration in the specified scaling group. Note that only
// one configuration can be active. Default to `false`.
func (o EciScalingConfigurationOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// Whether create eip automatically.
func (o EciScalingConfigurationOutput) AutoCreateEip() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.BoolPtrOutput { return v.AutoCreateEip }).(pulumi.BoolPtrOutput)
}

// The name of the container group.
func (o EciScalingConfigurationOutput) ContainerGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.ContainerGroupName }).(pulumi.StringPtrOutput)
}

// The list of containers. See `containers` below for details.
func (o EciScalingConfigurationOutput) Containers() EciScalingConfigurationContainerArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationContainerArrayOutput { return v.Containers }).(EciScalingConfigurationContainerArrayOutput)
}

// The amount of CPU resources allocated to the container group.
func (o EciScalingConfigurationOutput) Cpu() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.Float64PtrOutput { return v.Cpu }).(pulumi.Float64PtrOutput)
}

// The description of data disk N. Valid values of N: 1 to 16. The description must be 2 to
// 256 characters in length and cannot start with http:// or https://.
func (o EciScalingConfigurationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// dns policy of contain group.
func (o EciScalingConfigurationOutput) DnsPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.DnsPolicy }).(pulumi.StringPtrOutput)
}

// egress bandwidth.
func (o EciScalingConfigurationOutput) EgressBandwidth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.IntPtrOutput { return v.EgressBandwidth }).(pulumi.IntPtrOutput)
}

// Eip bandwidth.
func (o EciScalingConfigurationOutput) EipBandwidth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.IntPtrOutput { return v.EipBandwidth }).(pulumi.IntPtrOutput)
}

// Enable sls log service.
func (o EciScalingConfigurationOutput) EnableSls() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.BoolPtrOutput { return v.EnableSls }).(pulumi.BoolPtrOutput)
}

// The eci scaling configuration will be deleted forcibly with deleting its scaling group.
// Default to false.
func (o EciScalingConfigurationOutput) ForceDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.BoolPtrOutput { return v.ForceDelete }).(pulumi.BoolPtrOutput)
}

// HostAliases. See `hostAliases` below.
func (o EciScalingConfigurationOutput) HostAliases() EciScalingConfigurationHostAliasArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationHostAliasArrayOutput { return v.HostAliases }).(EciScalingConfigurationHostAliasArrayOutput)
}

// Hostname of an ECI instance.
func (o EciScalingConfigurationOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.HostName }).(pulumi.StringPtrOutput)
}

// The image registry credential.   See `imageRegistryCredentials` below for
// details.
func (o EciScalingConfigurationOutput) ImageRegistryCredentials() EciScalingConfigurationImageRegistryCredentialArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationImageRegistryCredentialArrayOutput {
		return v.ImageRegistryCredentials
	}).(EciScalingConfigurationImageRegistryCredentialArrayOutput)
}

// Ingress bandwidth.
func (o EciScalingConfigurationOutput) IngressBandwidth() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.IntPtrOutput { return v.IngressBandwidth }).(pulumi.IntPtrOutput)
}

// The list of initContainers. See `initContainers` below for details.
func (o EciScalingConfigurationOutput) InitContainers() EciScalingConfigurationInitContainerArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationInitContainerArrayOutput {
		return v.InitContainers
	}).(EciScalingConfigurationInitContainerArrayOutput)
}

// The amount of memory resources allocated to the container group.
func (o EciScalingConfigurationOutput) Memory() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.Float64PtrOutput { return v.Memory }).(pulumi.Float64PtrOutput)
}

// The RAM role that the container group assumes. ECI and ECS share the same RAM role.
func (o EciScalingConfigurationOutput) RamRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.RamRoleName }).(pulumi.StringPtrOutput)
}

// ID of resource group.
func (o EciScalingConfigurationOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The restart policy of the container group. Default to `Always`.
func (o EciScalingConfigurationOutput) RestartPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.RestartPolicy }).(pulumi.StringPtrOutput)
}

// Name shown for the scheduled task. which must contain 2-64 characters (
// English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number,
// underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is
// EciScalingConfigurationId.
func (o EciScalingConfigurationOutput) ScalingConfigurationName() pulumi.StringOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringOutput { return v.ScalingConfigurationName }).(pulumi.StringOutput)
}

// ID of the scaling group of a eci scaling configuration.
func (o EciScalingConfigurationOutput) ScalingGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringOutput { return v.ScalingGroupId }).(pulumi.StringOutput)
}

// ID of the security group used to create new instance. It is conflict
// with `securityGroupIds`.
func (o EciScalingConfigurationOutput) SecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.SecurityGroupId }).(pulumi.StringPtrOutput)
}

// The maximum price hourly for spot instance.
func (o EciScalingConfigurationOutput) SpotPriceLimit() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.Float64PtrOutput { return v.SpotPriceLimit }).(pulumi.Float64PtrOutput)
}

// The spot strategy for a Pay-As-You-Go instance. Valid values: `NoSpot`, `SpotAsPriceGo`
// , `SpotWithPriceLimit`.
func (o EciScalingConfigurationOutput) SpotStrategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.StringPtrOutput { return v.SpotStrategy }).(pulumi.StringPtrOutput)
}

// A mapping of tags to assign to the resource. It will be applied for ECI instances finally.
//   - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "http://", or "https://". It cannot
//     be a null string.
//   - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "http://", or "https://" It can be
//     a null string.
func (o EciScalingConfigurationOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The list of volumes. See `volumes` below for details.
func (o EciScalingConfigurationOutput) Volumes() EciScalingConfigurationVolumeArrayOutput {
	return o.ApplyT(func(v *EciScalingConfiguration) EciScalingConfigurationVolumeArrayOutput { return v.Volumes }).(EciScalingConfigurationVolumeArrayOutput)
}

type EciScalingConfigurationArrayOutput struct{ *pulumi.OutputState }

func (EciScalingConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EciScalingConfiguration)(nil)).Elem()
}

func (o EciScalingConfigurationArrayOutput) ToEciScalingConfigurationArrayOutput() EciScalingConfigurationArrayOutput {
	return o
}

func (o EciScalingConfigurationArrayOutput) ToEciScalingConfigurationArrayOutputWithContext(ctx context.Context) EciScalingConfigurationArrayOutput {
	return o
}

func (o EciScalingConfigurationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EciScalingConfiguration] {
	return pulumix.Output[[]*EciScalingConfiguration]{
		OutputState: o.OutputState,
	}
}

func (o EciScalingConfigurationArrayOutput) Index(i pulumi.IntInput) EciScalingConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EciScalingConfiguration {
		return vs[0].([]*EciScalingConfiguration)[vs[1].(int)]
	}).(EciScalingConfigurationOutput)
}

type EciScalingConfigurationMapOutput struct{ *pulumi.OutputState }

func (EciScalingConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EciScalingConfiguration)(nil)).Elem()
}

func (o EciScalingConfigurationMapOutput) ToEciScalingConfigurationMapOutput() EciScalingConfigurationMapOutput {
	return o
}

func (o EciScalingConfigurationMapOutput) ToEciScalingConfigurationMapOutputWithContext(ctx context.Context) EciScalingConfigurationMapOutput {
	return o
}

func (o EciScalingConfigurationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EciScalingConfiguration] {
	return pulumix.Output[map[string]*EciScalingConfiguration]{
		OutputState: o.OutputState,
	}
}

func (o EciScalingConfigurationMapOutput) MapIndex(k pulumi.StringInput) EciScalingConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EciScalingConfiguration {
		return vs[0].(map[string]*EciScalingConfiguration)[vs[1].(string)]
	}).(EciScalingConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EciScalingConfigurationInput)(nil)).Elem(), &EciScalingConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*EciScalingConfigurationArrayInput)(nil)).Elem(), EciScalingConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EciScalingConfigurationMapInput)(nil)).Elem(), EciScalingConfigurationMap{})
	pulumi.RegisterOutputType(EciScalingConfigurationOutput{})
	pulumi.RegisterOutputType(EciScalingConfigurationArrayOutput{})
	pulumi.RegisterOutputType(EciScalingConfigurationMapOutput{})
}
