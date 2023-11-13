// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Ebs Dedicated Block Storage Cluster resource.
//
// For information about Ebs Dedicated Block Storage Cluster and how to use it, see [What is Dedicated Block Storage Cluster](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/CreateDedicatedBlockStorageCluster).
//
// > **NOTE:** Available in v1.195.0+.
//
// ## Import
//
// Ebs Dedicated Block Storage Cluster can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ebs/dedicatedBlockStorageCluster:DedicatedBlockStorageCluster example <id>
//
// ```
type DedicatedBlockStorageCluster struct {
	pulumi.CustomResourceState

	// The available capacity of the dedicated block storage cluster. Unit: GiB.
	AvailableCapacity pulumi.StringOutput `pulumi:"availableCapacity"`
	// The type of cloud disk that can be created by a dedicated block storage cluster.
	Category pulumi.StringOutput `pulumi:"category"`
	// The creation time of the resource
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The first ID of the resource
	DedicatedBlockStorageClusterId pulumi.StringOutput `pulumi:"dedicatedBlockStorageClusterId"`
	// The name of the resource
	DedicatedBlockStorageClusterName pulumi.StringOutput `pulumi:"dedicatedBlockStorageClusterName"`
	// Capacity to be delivered in GB.
	DeliveryCapacity pulumi.StringOutput `pulumi:"deliveryCapacity"`
	// The description of the dedicated block storage cluster.
	Description pulumi.StringOutput `pulumi:"description"`
	// The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
	ExpiredTime pulumi.StringOutput `pulumi:"expiredTime"`
	// Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
	PerformanceLevel pulumi.StringOutput `pulumi:"performanceLevel"`
	// The ID of the resource group
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// This parameter is not supported.
	SupportedCategory pulumi.StringOutput `pulumi:"supportedCategory"`
	// The total capacity of the dedicated block storage cluster. Unit: GiB.
	TotalCapacity pulumi.StringOutput `pulumi:"totalCapacity"`
	// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
	Type pulumi.StringOutput `pulumi:"type"`
	// The used (created disk) capacity of the current cluster, in GB
	UsedCapacity pulumi.StringOutput `pulumi:"usedCapacity"`
	// The zone ID  of the resource
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDedicatedBlockStorageCluster registers a new resource with the given unique name, arguments, and options.
func NewDedicatedBlockStorageCluster(ctx *pulumi.Context,
	name string, args *DedicatedBlockStorageClusterArgs, opts ...pulumi.ResourceOption) (*DedicatedBlockStorageCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DedicatedBlockStorageClusterName == nil {
		return nil, errors.New("invalid value for required argument 'DedicatedBlockStorageClusterName'")
	}
	if args.TotalCapacity == nil {
		return nil, errors.New("invalid value for required argument 'TotalCapacity'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DedicatedBlockStorageCluster
	err := ctx.RegisterResource("alicloud:ebs/dedicatedBlockStorageCluster:DedicatedBlockStorageCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDedicatedBlockStorageCluster gets an existing DedicatedBlockStorageCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDedicatedBlockStorageCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DedicatedBlockStorageClusterState, opts ...pulumi.ResourceOption) (*DedicatedBlockStorageCluster, error) {
	var resource DedicatedBlockStorageCluster
	err := ctx.ReadResource("alicloud:ebs/dedicatedBlockStorageCluster:DedicatedBlockStorageCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DedicatedBlockStorageCluster resources.
type dedicatedBlockStorageClusterState struct {
	// The available capacity of the dedicated block storage cluster. Unit: GiB.
	AvailableCapacity *string `pulumi:"availableCapacity"`
	// The type of cloud disk that can be created by a dedicated block storage cluster.
	Category *string `pulumi:"category"`
	// The creation time of the resource
	CreateTime *string `pulumi:"createTime"`
	// The first ID of the resource
	DedicatedBlockStorageClusterId *string `pulumi:"dedicatedBlockStorageClusterId"`
	// The name of the resource
	DedicatedBlockStorageClusterName *string `pulumi:"dedicatedBlockStorageClusterName"`
	// Capacity to be delivered in GB.
	DeliveryCapacity *string `pulumi:"deliveryCapacity"`
	// The description of the dedicated block storage cluster.
	Description *string `pulumi:"description"`
	// The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
	ExpiredTime *string `pulumi:"expiredTime"`
	// Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// The ID of the resource group
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// This parameter is not supported.
	SupportedCategory *string `pulumi:"supportedCategory"`
	// The total capacity of the dedicated block storage cluster. Unit: GiB.
	TotalCapacity *string `pulumi:"totalCapacity"`
	// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
	Type *string `pulumi:"type"`
	// The used (created disk) capacity of the current cluster, in GB
	UsedCapacity *string `pulumi:"usedCapacity"`
	// The zone ID  of the resource
	ZoneId *string `pulumi:"zoneId"`
}

type DedicatedBlockStorageClusterState struct {
	// The available capacity of the dedicated block storage cluster. Unit: GiB.
	AvailableCapacity pulumi.StringPtrInput
	// The type of cloud disk that can be created by a dedicated block storage cluster.
	Category pulumi.StringPtrInput
	// The creation time of the resource
	CreateTime pulumi.StringPtrInput
	// The first ID of the resource
	DedicatedBlockStorageClusterId pulumi.StringPtrInput
	// The name of the resource
	DedicatedBlockStorageClusterName pulumi.StringPtrInput
	// Capacity to be delivered in GB.
	DeliveryCapacity pulumi.StringPtrInput
	// The description of the dedicated block storage cluster.
	Description pulumi.StringPtrInput
	// The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
	ExpiredTime pulumi.StringPtrInput
	// Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
	PerformanceLevel pulumi.StringPtrInput
	// The ID of the resource group
	ResourceGroupId pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// This parameter is not supported.
	SupportedCategory pulumi.StringPtrInput
	// The total capacity of the dedicated block storage cluster. Unit: GiB.
	TotalCapacity pulumi.StringPtrInput
	// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
	Type pulumi.StringPtrInput
	// The used (created disk) capacity of the current cluster, in GB
	UsedCapacity pulumi.StringPtrInput
	// The zone ID  of the resource
	ZoneId pulumi.StringPtrInput
}

func (DedicatedBlockStorageClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedBlockStorageClusterState)(nil)).Elem()
}

type dedicatedBlockStorageClusterArgs struct {
	// The name of the resource
	DedicatedBlockStorageClusterName string `pulumi:"dedicatedBlockStorageClusterName"`
	// The description of the dedicated block storage cluster.
	Description *string `pulumi:"description"`
	// The total capacity of the dedicated block storage cluster. Unit: GiB.
	TotalCapacity string `pulumi:"totalCapacity"`
	// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
	Type string `pulumi:"type"`
	// The zone ID  of the resource
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DedicatedBlockStorageCluster resource.
type DedicatedBlockStorageClusterArgs struct {
	// The name of the resource
	DedicatedBlockStorageClusterName pulumi.StringInput
	// The description of the dedicated block storage cluster.
	Description pulumi.StringPtrInput
	// The total capacity of the dedicated block storage cluster. Unit: GiB.
	TotalCapacity pulumi.StringInput
	// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
	Type pulumi.StringInput
	// The zone ID  of the resource
	ZoneId pulumi.StringInput
}

func (DedicatedBlockStorageClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedBlockStorageClusterArgs)(nil)).Elem()
}

type DedicatedBlockStorageClusterInput interface {
	pulumi.Input

	ToDedicatedBlockStorageClusterOutput() DedicatedBlockStorageClusterOutput
	ToDedicatedBlockStorageClusterOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterOutput
}

func (*DedicatedBlockStorageCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedBlockStorageCluster)(nil)).Elem()
}

func (i *DedicatedBlockStorageCluster) ToDedicatedBlockStorageClusterOutput() DedicatedBlockStorageClusterOutput {
	return i.ToDedicatedBlockStorageClusterOutputWithContext(context.Background())
}

func (i *DedicatedBlockStorageCluster) ToDedicatedBlockStorageClusterOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedBlockStorageClusterOutput)
}

// DedicatedBlockStorageClusterArrayInput is an input type that accepts DedicatedBlockStorageClusterArray and DedicatedBlockStorageClusterArrayOutput values.
// You can construct a concrete instance of `DedicatedBlockStorageClusterArrayInput` via:
//
//	DedicatedBlockStorageClusterArray{ DedicatedBlockStorageClusterArgs{...} }
type DedicatedBlockStorageClusterArrayInput interface {
	pulumi.Input

	ToDedicatedBlockStorageClusterArrayOutput() DedicatedBlockStorageClusterArrayOutput
	ToDedicatedBlockStorageClusterArrayOutputWithContext(context.Context) DedicatedBlockStorageClusterArrayOutput
}

type DedicatedBlockStorageClusterArray []DedicatedBlockStorageClusterInput

func (DedicatedBlockStorageClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedBlockStorageCluster)(nil)).Elem()
}

func (i DedicatedBlockStorageClusterArray) ToDedicatedBlockStorageClusterArrayOutput() DedicatedBlockStorageClusterArrayOutput {
	return i.ToDedicatedBlockStorageClusterArrayOutputWithContext(context.Background())
}

func (i DedicatedBlockStorageClusterArray) ToDedicatedBlockStorageClusterArrayOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedBlockStorageClusterArrayOutput)
}

// DedicatedBlockStorageClusterMapInput is an input type that accepts DedicatedBlockStorageClusterMap and DedicatedBlockStorageClusterMapOutput values.
// You can construct a concrete instance of `DedicatedBlockStorageClusterMapInput` via:
//
//	DedicatedBlockStorageClusterMap{ "key": DedicatedBlockStorageClusterArgs{...} }
type DedicatedBlockStorageClusterMapInput interface {
	pulumi.Input

	ToDedicatedBlockStorageClusterMapOutput() DedicatedBlockStorageClusterMapOutput
	ToDedicatedBlockStorageClusterMapOutputWithContext(context.Context) DedicatedBlockStorageClusterMapOutput
}

type DedicatedBlockStorageClusterMap map[string]DedicatedBlockStorageClusterInput

func (DedicatedBlockStorageClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedBlockStorageCluster)(nil)).Elem()
}

func (i DedicatedBlockStorageClusterMap) ToDedicatedBlockStorageClusterMapOutput() DedicatedBlockStorageClusterMapOutput {
	return i.ToDedicatedBlockStorageClusterMapOutputWithContext(context.Background())
}

func (i DedicatedBlockStorageClusterMap) ToDedicatedBlockStorageClusterMapOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedBlockStorageClusterMapOutput)
}

type DedicatedBlockStorageClusterOutput struct{ *pulumi.OutputState }

func (DedicatedBlockStorageClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedBlockStorageCluster)(nil)).Elem()
}

func (o DedicatedBlockStorageClusterOutput) ToDedicatedBlockStorageClusterOutput() DedicatedBlockStorageClusterOutput {
	return o
}

func (o DedicatedBlockStorageClusterOutput) ToDedicatedBlockStorageClusterOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterOutput {
	return o
}

// The available capacity of the dedicated block storage cluster. Unit: GiB.
func (o DedicatedBlockStorageClusterOutput) AvailableCapacity() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.AvailableCapacity }).(pulumi.StringOutput)
}

// The type of cloud disk that can be created by a dedicated block storage cluster.
func (o DedicatedBlockStorageClusterOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.Category }).(pulumi.StringOutput)
}

// The creation time of the resource
func (o DedicatedBlockStorageClusterOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The first ID of the resource
func (o DedicatedBlockStorageClusterOutput) DedicatedBlockStorageClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.DedicatedBlockStorageClusterId }).(pulumi.StringOutput)
}

// The name of the resource
func (o DedicatedBlockStorageClusterOutput) DedicatedBlockStorageClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.DedicatedBlockStorageClusterName }).(pulumi.StringOutput)
}

// Capacity to be delivered in GB.
func (o DedicatedBlockStorageClusterOutput) DeliveryCapacity() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.DeliveryCapacity }).(pulumi.StringOutput)
}

// The description of the dedicated block storage cluster.
func (o DedicatedBlockStorageClusterOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The expiration time of the dedicated block storage cluster, in the Unix timestamp format, in seconds.
func (o DedicatedBlockStorageClusterOutput) ExpiredTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.ExpiredTime }).(pulumi.StringOutput)
}

// Cloud disk performance level, possible values:-PL0.-PL1.-PL2.-PL3.> Only valid in SupportedCategory = cloud_essd.
func (o DedicatedBlockStorageClusterOutput) PerformanceLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.PerformanceLevel }).(pulumi.StringOutput)
}

// The ID of the resource group
func (o DedicatedBlockStorageClusterOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the resource
func (o DedicatedBlockStorageClusterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// This parameter is not supported.
func (o DedicatedBlockStorageClusterOutput) SupportedCategory() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.SupportedCategory }).(pulumi.StringOutput)
}

// The total capacity of the dedicated block storage cluster. Unit: GiB.
func (o DedicatedBlockStorageClusterOutput) TotalCapacity() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.TotalCapacity }).(pulumi.StringOutput)
}

// The dedicated block storage cluster performance type. Possible values:-Standard: Basic type. This type of dedicated block storage cluster can create an ESSD PL0 cloud disk.-Premium: performance type. This type of dedicated block storage cluster can create an ESSD PL1 cloud disk.
func (o DedicatedBlockStorageClusterOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The used (created disk) capacity of the current cluster, in GB
func (o DedicatedBlockStorageClusterOutput) UsedCapacity() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.UsedCapacity }).(pulumi.StringOutput)
}

// The zone ID  of the resource
func (o DedicatedBlockStorageClusterOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DedicatedBlockStorageCluster) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type DedicatedBlockStorageClusterArrayOutput struct{ *pulumi.OutputState }

func (DedicatedBlockStorageClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedBlockStorageCluster)(nil)).Elem()
}

func (o DedicatedBlockStorageClusterArrayOutput) ToDedicatedBlockStorageClusterArrayOutput() DedicatedBlockStorageClusterArrayOutput {
	return o
}

func (o DedicatedBlockStorageClusterArrayOutput) ToDedicatedBlockStorageClusterArrayOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterArrayOutput {
	return o
}

func (o DedicatedBlockStorageClusterArrayOutput) Index(i pulumi.IntInput) DedicatedBlockStorageClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DedicatedBlockStorageCluster {
		return vs[0].([]*DedicatedBlockStorageCluster)[vs[1].(int)]
	}).(DedicatedBlockStorageClusterOutput)
}

type DedicatedBlockStorageClusterMapOutput struct{ *pulumi.OutputState }

func (DedicatedBlockStorageClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedBlockStorageCluster)(nil)).Elem()
}

func (o DedicatedBlockStorageClusterMapOutput) ToDedicatedBlockStorageClusterMapOutput() DedicatedBlockStorageClusterMapOutput {
	return o
}

func (o DedicatedBlockStorageClusterMapOutput) ToDedicatedBlockStorageClusterMapOutputWithContext(ctx context.Context) DedicatedBlockStorageClusterMapOutput {
	return o
}

func (o DedicatedBlockStorageClusterMapOutput) MapIndex(k pulumi.StringInput) DedicatedBlockStorageClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DedicatedBlockStorageCluster {
		return vs[0].(map[string]*DedicatedBlockStorageCluster)[vs[1].(string)]
	}).(DedicatedBlockStorageClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedBlockStorageClusterInput)(nil)).Elem(), &DedicatedBlockStorageCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedBlockStorageClusterArrayInput)(nil)).Elem(), DedicatedBlockStorageClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedBlockStorageClusterMapInput)(nil)).Elem(), DedicatedBlockStorageClusterMap{})
	pulumi.RegisterOutputType(DedicatedBlockStorageClusterOutput{})
	pulumi.RegisterOutputType(DedicatedBlockStorageClusterArrayOutput{})
	pulumi.RegisterOutputType(DedicatedBlockStorageClusterMapOutput{})
}
