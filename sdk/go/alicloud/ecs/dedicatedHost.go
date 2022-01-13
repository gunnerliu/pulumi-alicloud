// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Ecs dedicated host can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/dedicatedHost:DedicatedHost default dh-2zedmxxxx
// ```
type DedicatedHost struct {
	pulumi.CustomResourceState

	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance pulumi.StringPtrOutput `pulumi:"actionOnMaintenance"`
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement pulumi.StringPtrOutput `pulumi:"autoPlacement"`
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime pulumi.StringOutput `pulumi:"autoReleaseTime"`
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
	CpuOverCommitRatio pulumi.Float64PtrOutput `pulumi:"cpuOverCommitRatio"`
	// The dedicated host cluster ID to which the dedicated host belongs.
	DedicatedHostClusterId pulumi.StringPtrOutput `pulumi:"dedicatedHostClusterId"`
	// The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
	DedicatedHostName pulumi.StringPtrOutput `pulumi:"dedicatedHostName"`
	// The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
	DedicatedHostType pulumi.StringOutput `pulumi:"dedicatedHostType"`
	// The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
	DetailFee pulumi.BoolPtrOutput `pulumi:"detailFee"`
	// Specifies whether to only validate the request. Default: `false`.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
	ExpiredTime pulumi.StringOutput `pulumi:"expiredTime"`
	// Specify the minimum purchase quantity of a dedicated host.
	MinQuantity pulumi.IntPtrOutput `pulumi:"minQuantity"`
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes DedicatedHostNetworkAttributeArrayOutput `pulumi:"networkAttributes"`
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The unit of the subscription period of the dedicated host.
	SaleCycle pulumi.StringOutput `pulumi:"saleCycle"`
	// The status of the dedicated host.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDedicatedHost registers a new resource with the given unique name, arguments, and options.
func NewDedicatedHost(ctx *pulumi.Context,
	name string, args *DedicatedHostArgs, opts ...pulumi.ResourceOption) (*DedicatedHost, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DedicatedHostType == nil {
		return nil, errors.New("invalid value for required argument 'DedicatedHostType'")
	}
	var resource DedicatedHost
	err := ctx.RegisterResource("alicloud:ecs/dedicatedHost:DedicatedHost", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDedicatedHost gets an existing DedicatedHost resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDedicatedHost(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DedicatedHostState, opts ...pulumi.ResourceOption) (*DedicatedHost, error) {
	var resource DedicatedHost
	err := ctx.ReadResource("alicloud:ecs/dedicatedHost:DedicatedHost", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DedicatedHost resources.
type dedicatedHostState struct {
	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance *string `pulumi:"actionOnMaintenance"`
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement *string `pulumi:"autoPlacement"`
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime *string `pulumi:"autoReleaseTime"`
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
	CpuOverCommitRatio *float64 `pulumi:"cpuOverCommitRatio"`
	// The dedicated host cluster ID to which the dedicated host belongs.
	DedicatedHostClusterId *string `pulumi:"dedicatedHostClusterId"`
	// The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
	DedicatedHostName *string `pulumi:"dedicatedHostName"`
	// The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
	DedicatedHostType *string `pulumi:"dedicatedHostType"`
	// The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
	DetailFee *bool `pulumi:"detailFee"`
	// Specifies whether to only validate the request. Default: `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
	ExpiredTime *string `pulumi:"expiredTime"`
	// Specify the minimum purchase quantity of a dedicated host.
	MinQuantity *int `pulumi:"minQuantity"`
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes []DedicatedHostNetworkAttribute `pulumi:"networkAttributes"`
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The unit of the subscription period of the dedicated host.
	SaleCycle *string `pulumi:"saleCycle"`
	// The status of the dedicated host.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
	ZoneId *string `pulumi:"zoneId"`
}

type DedicatedHostState struct {
	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance pulumi.StringPtrInput
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement pulumi.StringPtrInput
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime pulumi.StringPtrInput
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew pulumi.BoolPtrInput
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.IntPtrInput
	// CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
	CpuOverCommitRatio pulumi.Float64PtrInput
	// The dedicated host cluster ID to which the dedicated host belongs.
	DedicatedHostClusterId pulumi.StringPtrInput
	// The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
	DedicatedHostName pulumi.StringPtrInput
	// The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
	DedicatedHostType pulumi.StringPtrInput
	// The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
	DetailFee pulumi.BoolPtrInput
	// Specifies whether to only validate the request. Default: `false`.
	DryRun pulumi.BoolPtrInput
	// The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
	ExpiredTime pulumi.StringPtrInput
	// Specify the minimum purchase quantity of a dedicated host.
	MinQuantity pulumi.IntPtrInput
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes DedicatedHostNetworkAttributeArrayInput
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType pulumi.StringPtrInput
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The unit of the subscription period of the dedicated host.
	SaleCycle pulumi.StringPtrInput
	// The status of the dedicated host.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
	ZoneId pulumi.StringPtrInput
}

func (DedicatedHostState) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedHostState)(nil)).Elem()
}

type dedicatedHostArgs struct {
	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance *string `pulumi:"actionOnMaintenance"`
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement *string `pulumi:"autoPlacement"`
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime *string `pulumi:"autoReleaseTime"`
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
	CpuOverCommitRatio *float64 `pulumi:"cpuOverCommitRatio"`
	// The dedicated host cluster ID to which the dedicated host belongs.
	DedicatedHostClusterId *string `pulumi:"dedicatedHostClusterId"`
	// The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
	DedicatedHostName *string `pulumi:"dedicatedHostName"`
	// The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
	DedicatedHostType string `pulumi:"dedicatedHostType"`
	// The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
	Description *string `pulumi:"description"`
	// Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
	DetailFee *bool `pulumi:"detailFee"`
	// Specifies whether to only validate the request. Default: `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
	ExpiredTime *string `pulumi:"expiredTime"`
	// Specify the minimum purchase quantity of a dedicated host.
	MinQuantity *int `pulumi:"minQuantity"`
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes []DedicatedHostNetworkAttribute `pulumi:"networkAttributes"`
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The unit of the subscription period of the dedicated host.
	SaleCycle *string `pulumi:"saleCycle"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DedicatedHost resource.
type DedicatedHostArgs struct {
	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance pulumi.StringPtrInput
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement pulumi.StringPtrInput
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime pulumi.StringPtrInput
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew pulumi.BoolPtrInput
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.IntPtrInput
	// CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
	CpuOverCommitRatio pulumi.Float64PtrInput
	// The dedicated host cluster ID to which the dedicated host belongs.
	DedicatedHostClusterId pulumi.StringPtrInput
	// The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
	DedicatedHostName pulumi.StringPtrInput
	// The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
	DedicatedHostType pulumi.StringInput
	// The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
	Description pulumi.StringPtrInput
	// Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
	DetailFee pulumi.BoolPtrInput
	// Specifies whether to only validate the request. Default: `false`.
	DryRun pulumi.BoolPtrInput
	// The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
	ExpiredTime pulumi.StringPtrInput
	// Specify the minimum purchase quantity of a dedicated host.
	MinQuantity pulumi.IntPtrInput
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes DedicatedHostNetworkAttributeArrayInput
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType pulumi.StringPtrInput
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The unit of the subscription period of the dedicated host.
	SaleCycle pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
	ZoneId pulumi.StringPtrInput
}

func (DedicatedHostArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dedicatedHostArgs)(nil)).Elem()
}

type DedicatedHostInput interface {
	pulumi.Input

	ToDedicatedHostOutput() DedicatedHostOutput
	ToDedicatedHostOutputWithContext(ctx context.Context) DedicatedHostOutput
}

func (*DedicatedHost) ElementType() reflect.Type {
	return reflect.TypeOf((*DedicatedHost)(nil))
}

func (i *DedicatedHost) ToDedicatedHostOutput() DedicatedHostOutput {
	return i.ToDedicatedHostOutputWithContext(context.Background())
}

func (i *DedicatedHost) ToDedicatedHostOutputWithContext(ctx context.Context) DedicatedHostOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostOutput)
}

func (i *DedicatedHost) ToDedicatedHostPtrOutput() DedicatedHostPtrOutput {
	return i.ToDedicatedHostPtrOutputWithContext(context.Background())
}

func (i *DedicatedHost) ToDedicatedHostPtrOutputWithContext(ctx context.Context) DedicatedHostPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostPtrOutput)
}

type DedicatedHostPtrInput interface {
	pulumi.Input

	ToDedicatedHostPtrOutput() DedicatedHostPtrOutput
	ToDedicatedHostPtrOutputWithContext(ctx context.Context) DedicatedHostPtrOutput
}

type dedicatedHostPtrType DedicatedHostArgs

func (*dedicatedHostPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedHost)(nil))
}

func (i *dedicatedHostPtrType) ToDedicatedHostPtrOutput() DedicatedHostPtrOutput {
	return i.ToDedicatedHostPtrOutputWithContext(context.Background())
}

func (i *dedicatedHostPtrType) ToDedicatedHostPtrOutputWithContext(ctx context.Context) DedicatedHostPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostPtrOutput)
}

// DedicatedHostArrayInput is an input type that accepts DedicatedHostArray and DedicatedHostArrayOutput values.
// You can construct a concrete instance of `DedicatedHostArrayInput` via:
//
//          DedicatedHostArray{ DedicatedHostArgs{...} }
type DedicatedHostArrayInput interface {
	pulumi.Input

	ToDedicatedHostArrayOutput() DedicatedHostArrayOutput
	ToDedicatedHostArrayOutputWithContext(context.Context) DedicatedHostArrayOutput
}

type DedicatedHostArray []DedicatedHostInput

func (DedicatedHostArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DedicatedHost)(nil)).Elem()
}

func (i DedicatedHostArray) ToDedicatedHostArrayOutput() DedicatedHostArrayOutput {
	return i.ToDedicatedHostArrayOutputWithContext(context.Background())
}

func (i DedicatedHostArray) ToDedicatedHostArrayOutputWithContext(ctx context.Context) DedicatedHostArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostArrayOutput)
}

// DedicatedHostMapInput is an input type that accepts DedicatedHostMap and DedicatedHostMapOutput values.
// You can construct a concrete instance of `DedicatedHostMapInput` via:
//
//          DedicatedHostMap{ "key": DedicatedHostArgs{...} }
type DedicatedHostMapInput interface {
	pulumi.Input

	ToDedicatedHostMapOutput() DedicatedHostMapOutput
	ToDedicatedHostMapOutputWithContext(context.Context) DedicatedHostMapOutput
}

type DedicatedHostMap map[string]DedicatedHostInput

func (DedicatedHostMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DedicatedHost)(nil)).Elem()
}

func (i DedicatedHostMap) ToDedicatedHostMapOutput() DedicatedHostMapOutput {
	return i.ToDedicatedHostMapOutputWithContext(context.Background())
}

func (i DedicatedHostMap) ToDedicatedHostMapOutputWithContext(ctx context.Context) DedicatedHostMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DedicatedHostMapOutput)
}

type DedicatedHostOutput struct{ *pulumi.OutputState }

func (DedicatedHostOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DedicatedHost)(nil))
}

func (o DedicatedHostOutput) ToDedicatedHostOutput() DedicatedHostOutput {
	return o
}

func (o DedicatedHostOutput) ToDedicatedHostOutputWithContext(ctx context.Context) DedicatedHostOutput {
	return o
}

func (o DedicatedHostOutput) ToDedicatedHostPtrOutput() DedicatedHostPtrOutput {
	return o.ToDedicatedHostPtrOutputWithContext(context.Background())
}

func (o DedicatedHostOutput) ToDedicatedHostPtrOutputWithContext(ctx context.Context) DedicatedHostPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DedicatedHost) *DedicatedHost {
		return &v
	}).(DedicatedHostPtrOutput)
}

type DedicatedHostPtrOutput struct{ *pulumi.OutputState }

func (DedicatedHostPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DedicatedHost)(nil))
}

func (o DedicatedHostPtrOutput) ToDedicatedHostPtrOutput() DedicatedHostPtrOutput {
	return o
}

func (o DedicatedHostPtrOutput) ToDedicatedHostPtrOutputWithContext(ctx context.Context) DedicatedHostPtrOutput {
	return o
}

func (o DedicatedHostPtrOutput) Elem() DedicatedHostOutput {
	return o.ApplyT(func(v *DedicatedHost) DedicatedHost {
		if v != nil {
			return *v
		}
		var ret DedicatedHost
		return ret
	}).(DedicatedHostOutput)
}

type DedicatedHostArrayOutput struct{ *pulumi.OutputState }

func (DedicatedHostArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DedicatedHost)(nil))
}

func (o DedicatedHostArrayOutput) ToDedicatedHostArrayOutput() DedicatedHostArrayOutput {
	return o
}

func (o DedicatedHostArrayOutput) ToDedicatedHostArrayOutputWithContext(ctx context.Context) DedicatedHostArrayOutput {
	return o
}

func (o DedicatedHostArrayOutput) Index(i pulumi.IntInput) DedicatedHostOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DedicatedHost {
		return vs[0].([]DedicatedHost)[vs[1].(int)]
	}).(DedicatedHostOutput)
}

type DedicatedHostMapOutput struct{ *pulumi.OutputState }

func (DedicatedHostMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DedicatedHost)(nil))
}

func (o DedicatedHostMapOutput) ToDedicatedHostMapOutput() DedicatedHostMapOutput {
	return o
}

func (o DedicatedHostMapOutput) ToDedicatedHostMapOutputWithContext(ctx context.Context) DedicatedHostMapOutput {
	return o
}

func (o DedicatedHostMapOutput) MapIndex(k pulumi.StringInput) DedicatedHostOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DedicatedHost {
		return vs[0].(map[string]DedicatedHost)[vs[1].(string)]
	}).(DedicatedHostOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostInput)(nil)).Elem(), &DedicatedHost{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostPtrInput)(nil)).Elem(), &DedicatedHost{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostArrayInput)(nil)).Elem(), DedicatedHostArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DedicatedHostMapInput)(nil)).Elem(), DedicatedHostMap{})
	pulumi.RegisterOutputType(DedicatedHostOutput{})
	pulumi.RegisterOutputType(DedicatedHostPtrOutput{})
	pulumi.RegisterOutputType(DedicatedHostArrayOutput{})
	pulumi.RegisterOutputType(DedicatedHostMapOutput{})
}
