// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This resouce used to create a dedicated host and store its initial version. For information about Aliecs Dedicated Host and how to use it, see [What is Resource Aliecs Dedicated Host](https://www.alibabacloud.com/help/doc-detail/134238.htm).
//
// > **NOTE:** Available in 1.91.0+.
type DedicatedHost struct {
	pulumi.CustomResourceState

	// The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
	ActionOnMaintenance pulumi.StringPtrOutput `pulumi:"actionOnMaintenance"`
	// Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
	AutoPlacement pulumi.StringPtrOutput `pulumi:"autoPlacement"`
	// The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
	AutoReleaseTime pulumi.StringPtrOutput `pulumi:"autoReleaseTime"`
	// Specifies whether to automatically renew the subscription dedicated host.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
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
	// dedicated host network parameters. contains the following attributes:
	NetworkAttributes DedicatedHostNetworkAttributeArrayOutput `pulumi:"networkAttributes"`
	// The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
	PaymentType pulumi.StringPtrOutput `pulumi:"paymentType"`
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
	if args == nil || args.DedicatedHostType == nil {
		return nil, errors.New("missing required argument 'DedicatedHostType'")
	}
	if args == nil {
		args = &DedicatedHostArgs{}
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
