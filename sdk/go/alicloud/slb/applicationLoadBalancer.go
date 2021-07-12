// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Application Load Balancer resource.
//
// > **NOTE:** Available in 1.123.1+
//
// > **NOTE:** At present, to avoid some unnecessary regulation confusion, SLB can not support alicloud international account to create `PayByBandwidth` instance.
//
// > **NOTE:** The supported specifications vary by region. Currently not all regions support guaranteed-performance instances.
// For more details about guaranteed-performance instance, see [Guaranteed-performance instances](https://www.alibabacloud.com/help/doc-detail/27657.htm).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "terraformtestslbconfig"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:       defaultNetwork.ID(),
// 			CidrBlock:   pulumi.String("172.16.0.0/21"),
// 			ZoneId:      pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = slb.NewApplicationLoadBalancer(ctx, "defaultApplicationLoadBalancer", &slb.ApplicationLoadBalancerArgs{
// 			LoadBalancerName: pulumi.String(name),
// 			AddressType:      pulumi.String("intranet"),
// 			LoadBalancerSpec: pulumi.String("slb.s2.small"),
// 			VswitchId:        defaultSwitch.ID(),
// 			Tags: pulumi.StringMap{
// 				"info": pulumi.String("create for internet"),
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
// Load balancer can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:slb/applicationLoadBalancer:ApplicationLoadBalancer example lb-abc123456
// ```
type ApplicationLoadBalancer struct {
	pulumi.CustomResourceState

	// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
	Address pulumi.StringOutput `pulumi:"address"`
	// The IP version of the SLB instance to be created, which can be set to `ipv4` or `ipv6` . Default to `ipv4`. Now, only internet instance support `ipv6` address.
	AddressIpVersion pulumi.StringPtrOutput `pulumi:"addressIpVersion"`
	// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be `intranet`.
	// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
	// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
	AddressType pulumi.StringOutput `pulumi:"addressType"`
	// Valid value is between 1 and 1000, If argument `internetChargeType` is `PayByTraffic`, then this value will be ignore.
	Bandwidth pulumi.IntPtrOutput `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
	DeleteProtection pulumi.StringPtrOutput `pulumi:"deleteProtection"`
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.124. Use 'payment_type' replaces it.
	InstanceChargeType pulumi.StringOutput `pulumi:"instanceChargeType"`
	// Valid values are `PayByBandwidth`, `PayByTraffic`. If this value is `PayByBandwidth`, then argument `addressType` must be `internet`. Default is `PayByTraffic`. If load balancer launched in VPC, this value must be `PayByTraffic`. Before version 1.10.1, the valid values are `paybybandwidth` and `paybytraffic`.
	InternetChargeType pulumi.StringPtrOutput `pulumi:"internetChargeType"`
	LoadBalancerName   pulumi.StringOutput    `pulumi:"loadBalancerName"`
	// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
	// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`,
	// `slb.s3.small`, `slb.s3.medium`, `slb.s3.large` and `slb.s4.large`.
	LoadBalancerSpec pulumi.StringOutput `pulumi:"loadBalancerSpec"`
	// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the [DescribeZone](https://help.aliyun.com/document_detail/27585.htm) API.
	MasterZoneId pulumi.StringOutput `pulumi:"masterZoneId"`
	// The resource of modification protection. It's effective when modification protection is `ConsoleProtection`.
	ModificationProtectionReason pulumi.StringPtrOutput `pulumi:"modificationProtectionReason"`
	// The status of modification protection. Valid values: `ConsoleProtection` and `NonProtection`. Default value is `NonProtection`.
	ModificationProtectionStatus pulumi.StringOutput `pulumi:"modificationProtectionStatus"`
	// Deprecated: Field 'name' has been deprecated from provider version 1.123.1. New field 'load_balancer_name' instead
	Name pulumi.StringOutput `pulumi:"name"`
	// The billing method of the load balancer. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	Period      pulumi.IntPtrOutput `pulumi:"period"`
	// The Id of resource group which the SLB belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
	SlaveZoneId pulumi.StringOutput `pulumi:"slaveZoneId"`
	// Deprecated: Field 'specification' has been deprecated from provider version 1.123.1. New field 'load_balancer_spec' instead
	Specification pulumi.StringOutput `pulumi:"specification"`
	// The status of slb load balancer. Valid values: `actice` and `inactice`. The system default value is `active`.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The VSwitch ID to launch in. If `addressType` is internet, it will be ignore.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
}

// NewApplicationLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewApplicationLoadBalancer(ctx *pulumi.Context,
	name string, args *ApplicationLoadBalancerArgs, opts ...pulumi.ResourceOption) (*ApplicationLoadBalancer, error) {
	if args == nil {
		args = &ApplicationLoadBalancerArgs{}
	}

	var resource ApplicationLoadBalancer
	err := ctx.RegisterResource("alicloud:slb/applicationLoadBalancer:ApplicationLoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationLoadBalancer gets an existing ApplicationLoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationLoadBalancerState, opts ...pulumi.ResourceOption) (*ApplicationLoadBalancer, error) {
	var resource ApplicationLoadBalancer
	err := ctx.ReadResource("alicloud:slb/applicationLoadBalancer:ApplicationLoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationLoadBalancer resources.
type applicationLoadBalancerState struct {
	// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
	Address *string `pulumi:"address"`
	// The IP version of the SLB instance to be created, which can be set to `ipv4` or `ipv6` . Default to `ipv4`. Now, only internet instance support `ipv6` address.
	AddressIpVersion *string `pulumi:"addressIpVersion"`
	// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be `intranet`.
	// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
	// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
	AddressType *string `pulumi:"addressType"`
	// Valid value is between 1 and 1000, If argument `internetChargeType` is `PayByTraffic`, then this value will be ignore.
	Bandwidth *int `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
	DeleteProtection *string `pulumi:"deleteProtection"`
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.124. Use 'payment_type' replaces it.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Valid values are `PayByBandwidth`, `PayByTraffic`. If this value is `PayByBandwidth`, then argument `addressType` must be `internet`. Default is `PayByTraffic`. If load balancer launched in VPC, this value must be `PayByTraffic`. Before version 1.10.1, the valid values are `paybybandwidth` and `paybytraffic`.
	InternetChargeType *string `pulumi:"internetChargeType"`
	LoadBalancerName   *string `pulumi:"loadBalancerName"`
	// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
	// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`,
	// `slb.s3.small`, `slb.s3.medium`, `slb.s3.large` and `slb.s4.large`.
	LoadBalancerSpec *string `pulumi:"loadBalancerSpec"`
	// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the [DescribeZone](https://help.aliyun.com/document_detail/27585.htm) API.
	MasterZoneId *string `pulumi:"masterZoneId"`
	// The resource of modification protection. It's effective when modification protection is `ConsoleProtection`.
	ModificationProtectionReason *string `pulumi:"modificationProtectionReason"`
	// The status of modification protection. Valid values: `ConsoleProtection` and `NonProtection`. Default value is `NonProtection`.
	ModificationProtectionStatus *string `pulumi:"modificationProtectionStatus"`
	// Deprecated: Field 'name' has been deprecated from provider version 1.123.1. New field 'load_balancer_name' instead
	Name *string `pulumi:"name"`
	// The billing method of the load balancer. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	Period      *int    `pulumi:"period"`
	// The Id of resource group which the SLB belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
	SlaveZoneId *string `pulumi:"slaveZoneId"`
	// Deprecated: Field 'specification' has been deprecated from provider version 1.123.1. New field 'load_balancer_spec' instead
	Specification *string `pulumi:"specification"`
	// The status of slb load balancer. Valid values: `actice` and `inactice`. The system default value is `active`.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
	Tags map[string]interface{} `pulumi:"tags"`
	// The VSwitch ID to launch in. If `addressType` is internet, it will be ignore.
	VswitchId *string `pulumi:"vswitchId"`
}

type ApplicationLoadBalancerState struct {
	// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
	Address pulumi.StringPtrInput
	// The IP version of the SLB instance to be created, which can be set to `ipv4` or `ipv6` . Default to `ipv4`. Now, only internet instance support `ipv6` address.
	AddressIpVersion pulumi.StringPtrInput
	// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be `intranet`.
	// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
	// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
	AddressType pulumi.StringPtrInput
	// Valid value is between 1 and 1000, If argument `internetChargeType` is `PayByTraffic`, then this value will be ignore.
	Bandwidth pulumi.IntPtrInput
	// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
	DeleteProtection pulumi.StringPtrInput
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.124. Use 'payment_type' replaces it.
	InstanceChargeType pulumi.StringPtrInput
	// Valid values are `PayByBandwidth`, `PayByTraffic`. If this value is `PayByBandwidth`, then argument `addressType` must be `internet`. Default is `PayByTraffic`. If load balancer launched in VPC, this value must be `PayByTraffic`. Before version 1.10.1, the valid values are `paybybandwidth` and `paybytraffic`.
	InternetChargeType pulumi.StringPtrInput
	LoadBalancerName   pulumi.StringPtrInput
	// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
	// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`,
	// `slb.s3.small`, `slb.s3.medium`, `slb.s3.large` and `slb.s4.large`.
	LoadBalancerSpec pulumi.StringPtrInput
	// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the [DescribeZone](https://help.aliyun.com/document_detail/27585.htm) API.
	MasterZoneId pulumi.StringPtrInput
	// The resource of modification protection. It's effective when modification protection is `ConsoleProtection`.
	ModificationProtectionReason pulumi.StringPtrInput
	// The status of modification protection. Valid values: `ConsoleProtection` and `NonProtection`. Default value is `NonProtection`.
	ModificationProtectionStatus pulumi.StringPtrInput
	// Deprecated: Field 'name' has been deprecated from provider version 1.123.1. New field 'load_balancer_name' instead
	Name pulumi.StringPtrInput
	// The billing method of the load balancer. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	Period      pulumi.IntPtrInput
	// The Id of resource group which the SLB belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
	SlaveZoneId pulumi.StringPtrInput
	// Deprecated: Field 'specification' has been deprecated from provider version 1.123.1. New field 'load_balancer_spec' instead
	Specification pulumi.StringPtrInput
	// The status of slb load balancer. Valid values: `actice` and `inactice`. The system default value is `active`.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
	Tags pulumi.MapInput
	// The VSwitch ID to launch in. If `addressType` is internet, it will be ignore.
	VswitchId pulumi.StringPtrInput
}

func (ApplicationLoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationLoadBalancerState)(nil)).Elem()
}

type applicationLoadBalancerArgs struct {
	// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
	Address *string `pulumi:"address"`
	// The IP version of the SLB instance to be created, which can be set to `ipv4` or `ipv6` . Default to `ipv4`. Now, only internet instance support `ipv6` address.
	AddressIpVersion *string `pulumi:"addressIpVersion"`
	// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be `intranet`.
	// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
	// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
	AddressType *string `pulumi:"addressType"`
	// Valid value is between 1 and 1000, If argument `internetChargeType` is `PayByTraffic`, then this value will be ignore.
	Bandwidth *int `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
	DeleteProtection *string `pulumi:"deleteProtection"`
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.124. Use 'payment_type' replaces it.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Valid values are `PayByBandwidth`, `PayByTraffic`. If this value is `PayByBandwidth`, then argument `addressType` must be `internet`. Default is `PayByTraffic`. If load balancer launched in VPC, this value must be `PayByTraffic`. Before version 1.10.1, the valid values are `paybybandwidth` and `paybytraffic`.
	InternetChargeType *string `pulumi:"internetChargeType"`
	LoadBalancerName   *string `pulumi:"loadBalancerName"`
	// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
	// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`,
	// `slb.s3.small`, `slb.s3.medium`, `slb.s3.large` and `slb.s4.large`.
	LoadBalancerSpec *string `pulumi:"loadBalancerSpec"`
	// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the [DescribeZone](https://help.aliyun.com/document_detail/27585.htm) API.
	MasterZoneId *string `pulumi:"masterZoneId"`
	// The resource of modification protection. It's effective when modification protection is `ConsoleProtection`.
	ModificationProtectionReason *string `pulumi:"modificationProtectionReason"`
	// The status of modification protection. Valid values: `ConsoleProtection` and `NonProtection`. Default value is `NonProtection`.
	ModificationProtectionStatus *string `pulumi:"modificationProtectionStatus"`
	// Deprecated: Field 'name' has been deprecated from provider version 1.123.1. New field 'load_balancer_name' instead
	Name *string `pulumi:"name"`
	// The billing method of the load balancer. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	Period      *int    `pulumi:"period"`
	// The Id of resource group which the SLB belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
	SlaveZoneId *string `pulumi:"slaveZoneId"`
	// Deprecated: Field 'specification' has been deprecated from provider version 1.123.1. New field 'load_balancer_spec' instead
	Specification *string `pulumi:"specification"`
	// The status of slb load balancer. Valid values: `actice` and `inactice`. The system default value is `active`.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
	Tags map[string]interface{} `pulumi:"tags"`
	// The VSwitch ID to launch in. If `addressType` is internet, it will be ignore.
	VswitchId *string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a ApplicationLoadBalancer resource.
type ApplicationLoadBalancerArgs struct {
	// Specify the IP address of the private network for the SLB instance, which must be in the destination CIDR block of the correspond ing switch.
	Address pulumi.StringPtrInput
	// The IP version of the SLB instance to be created, which can be set to `ipv4` or `ipv6` . Default to `ipv4`. Now, only internet instance support `ipv6` address.
	AddressIpVersion pulumi.StringPtrInput
	// The network type of the SLB instance. Valid values: ["internet", "intranet"]. If load balancer launched in VPC, this value must be `intranet`.
	// - internet: After an Internet SLB instance is created, the system allocates a public IP address so that the instance can forward requests from the Internet.
	// - intranet: After an intranet SLB instance is created, the system allocates an intranet IP address so that the instance can only forward intranet requests.
	AddressType pulumi.StringPtrInput
	// Valid value is between 1 and 1000, If argument `internetChargeType` is `PayByTraffic`, then this value will be ignore.
	Bandwidth pulumi.IntPtrInput
	// Whether enable the deletion protection or not. on: Enable deletion protection. off: Disable deletion protection. Default to off. Only postpaid instance support this function.
	DeleteProtection pulumi.StringPtrInput
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.124. Use 'payment_type' replaces it.
	InstanceChargeType pulumi.StringPtrInput
	// Valid values are `PayByBandwidth`, `PayByTraffic`. If this value is `PayByBandwidth`, then argument `addressType` must be `internet`. Default is `PayByTraffic`. If load balancer launched in VPC, this value must be `PayByTraffic`. Before version 1.10.1, the valid values are `paybybandwidth` and `paybytraffic`.
	InternetChargeType pulumi.StringPtrInput
	LoadBalancerName   pulumi.StringPtrInput
	// The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
	// Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: `slb.s1.small`, `slb.s2.small`, `slb.s2.medium`,
	// `slb.s3.small`, `slb.s3.medium`, `slb.s3.large` and `slb.s4.large`.
	LoadBalancerSpec pulumi.StringPtrInput
	// The primary zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the [DescribeZone](https://help.aliyun.com/document_detail/27585.htm) API.
	MasterZoneId pulumi.StringPtrInput
	// The resource of modification protection. It's effective when modification protection is `ConsoleProtection`.
	ModificationProtectionReason pulumi.StringPtrInput
	// The status of modification protection. Valid values: `ConsoleProtection` and `NonProtection`. Default value is `NonProtection`.
	ModificationProtectionStatus pulumi.StringPtrInput
	// Deprecated: Field 'name' has been deprecated from provider version 1.123.1. New field 'load_balancer_name' instead
	Name pulumi.StringPtrInput
	// The billing method of the load balancer. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	Period      pulumi.IntPtrInput
	// The Id of resource group which the SLB belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The standby zone ID of the SLB instance. If not specified, the system will be randomly assigned. You can query the primary and standby zones in a region by calling the DescribeZone API.
	SlaveZoneId pulumi.StringPtrInput
	// Deprecated: Field 'specification' has been deprecated from provider version 1.123.1. New field 'load_balancer_spec' instead
	Specification pulumi.StringPtrInput
	// The status of slb load balancer. Valid values: `actice` and `inactice`. The system default value is `active`.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource. The `tags` can have a maximum of 10 tag for every load balancer instance.
	Tags pulumi.MapInput
	// The VSwitch ID to launch in. If `addressType` is internet, it will be ignore.
	VswitchId pulumi.StringPtrInput
}

func (ApplicationLoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationLoadBalancerArgs)(nil)).Elem()
}

type ApplicationLoadBalancerInput interface {
	pulumi.Input

	ToApplicationLoadBalancerOutput() ApplicationLoadBalancerOutput
	ToApplicationLoadBalancerOutputWithContext(ctx context.Context) ApplicationLoadBalancerOutput
}

func (*ApplicationLoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((*ApplicationLoadBalancer)(nil))
}

func (i *ApplicationLoadBalancer) ToApplicationLoadBalancerOutput() ApplicationLoadBalancerOutput {
	return i.ToApplicationLoadBalancerOutputWithContext(context.Background())
}

func (i *ApplicationLoadBalancer) ToApplicationLoadBalancerOutputWithContext(ctx context.Context) ApplicationLoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLoadBalancerOutput)
}

func (i *ApplicationLoadBalancer) ToApplicationLoadBalancerPtrOutput() ApplicationLoadBalancerPtrOutput {
	return i.ToApplicationLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *ApplicationLoadBalancer) ToApplicationLoadBalancerPtrOutputWithContext(ctx context.Context) ApplicationLoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLoadBalancerPtrOutput)
}

type ApplicationLoadBalancerPtrInput interface {
	pulumi.Input

	ToApplicationLoadBalancerPtrOutput() ApplicationLoadBalancerPtrOutput
	ToApplicationLoadBalancerPtrOutputWithContext(ctx context.Context) ApplicationLoadBalancerPtrOutput
}

type applicationLoadBalancerPtrType ApplicationLoadBalancerArgs

func (*applicationLoadBalancerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationLoadBalancer)(nil))
}

func (i *applicationLoadBalancerPtrType) ToApplicationLoadBalancerPtrOutput() ApplicationLoadBalancerPtrOutput {
	return i.ToApplicationLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *applicationLoadBalancerPtrType) ToApplicationLoadBalancerPtrOutputWithContext(ctx context.Context) ApplicationLoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLoadBalancerPtrOutput)
}

// ApplicationLoadBalancerArrayInput is an input type that accepts ApplicationLoadBalancerArray and ApplicationLoadBalancerArrayOutput values.
// You can construct a concrete instance of `ApplicationLoadBalancerArrayInput` via:
//
//          ApplicationLoadBalancerArray{ ApplicationLoadBalancerArgs{...} }
type ApplicationLoadBalancerArrayInput interface {
	pulumi.Input

	ToApplicationLoadBalancerArrayOutput() ApplicationLoadBalancerArrayOutput
	ToApplicationLoadBalancerArrayOutputWithContext(context.Context) ApplicationLoadBalancerArrayOutput
}

type ApplicationLoadBalancerArray []ApplicationLoadBalancerInput

func (ApplicationLoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ApplicationLoadBalancer)(nil))
}

func (i ApplicationLoadBalancerArray) ToApplicationLoadBalancerArrayOutput() ApplicationLoadBalancerArrayOutput {
	return i.ToApplicationLoadBalancerArrayOutputWithContext(context.Background())
}

func (i ApplicationLoadBalancerArray) ToApplicationLoadBalancerArrayOutputWithContext(ctx context.Context) ApplicationLoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLoadBalancerArrayOutput)
}

// ApplicationLoadBalancerMapInput is an input type that accepts ApplicationLoadBalancerMap and ApplicationLoadBalancerMapOutput values.
// You can construct a concrete instance of `ApplicationLoadBalancerMapInput` via:
//
//          ApplicationLoadBalancerMap{ "key": ApplicationLoadBalancerArgs{...} }
type ApplicationLoadBalancerMapInput interface {
	pulumi.Input

	ToApplicationLoadBalancerMapOutput() ApplicationLoadBalancerMapOutput
	ToApplicationLoadBalancerMapOutputWithContext(context.Context) ApplicationLoadBalancerMapOutput
}

type ApplicationLoadBalancerMap map[string]ApplicationLoadBalancerInput

func (ApplicationLoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ApplicationLoadBalancer)(nil))
}

func (i ApplicationLoadBalancerMap) ToApplicationLoadBalancerMapOutput() ApplicationLoadBalancerMapOutput {
	return i.ToApplicationLoadBalancerMapOutputWithContext(context.Background())
}

func (i ApplicationLoadBalancerMap) ToApplicationLoadBalancerMapOutputWithContext(ctx context.Context) ApplicationLoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLoadBalancerMapOutput)
}

type ApplicationLoadBalancerOutput struct {
	*pulumi.OutputState
}

func (ApplicationLoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ApplicationLoadBalancer)(nil))
}

func (o ApplicationLoadBalancerOutput) ToApplicationLoadBalancerOutput() ApplicationLoadBalancerOutput {
	return o
}

func (o ApplicationLoadBalancerOutput) ToApplicationLoadBalancerOutputWithContext(ctx context.Context) ApplicationLoadBalancerOutput {
	return o
}

func (o ApplicationLoadBalancerOutput) ToApplicationLoadBalancerPtrOutput() ApplicationLoadBalancerPtrOutput {
	return o.ToApplicationLoadBalancerPtrOutputWithContext(context.Background())
}

func (o ApplicationLoadBalancerOutput) ToApplicationLoadBalancerPtrOutputWithContext(ctx context.Context) ApplicationLoadBalancerPtrOutput {
	return o.ApplyT(func(v ApplicationLoadBalancer) *ApplicationLoadBalancer {
		return &v
	}).(ApplicationLoadBalancerPtrOutput)
}

type ApplicationLoadBalancerPtrOutput struct {
	*pulumi.OutputState
}

func (ApplicationLoadBalancerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationLoadBalancer)(nil))
}

func (o ApplicationLoadBalancerPtrOutput) ToApplicationLoadBalancerPtrOutput() ApplicationLoadBalancerPtrOutput {
	return o
}

func (o ApplicationLoadBalancerPtrOutput) ToApplicationLoadBalancerPtrOutputWithContext(ctx context.Context) ApplicationLoadBalancerPtrOutput {
	return o
}

type ApplicationLoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (ApplicationLoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ApplicationLoadBalancer)(nil))
}

func (o ApplicationLoadBalancerArrayOutput) ToApplicationLoadBalancerArrayOutput() ApplicationLoadBalancerArrayOutput {
	return o
}

func (o ApplicationLoadBalancerArrayOutput) ToApplicationLoadBalancerArrayOutputWithContext(ctx context.Context) ApplicationLoadBalancerArrayOutput {
	return o
}

func (o ApplicationLoadBalancerArrayOutput) Index(i pulumi.IntInput) ApplicationLoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ApplicationLoadBalancer {
		return vs[0].([]ApplicationLoadBalancer)[vs[1].(int)]
	}).(ApplicationLoadBalancerOutput)
}

type ApplicationLoadBalancerMapOutput struct{ *pulumi.OutputState }

func (ApplicationLoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ApplicationLoadBalancer)(nil))
}

func (o ApplicationLoadBalancerMapOutput) ToApplicationLoadBalancerMapOutput() ApplicationLoadBalancerMapOutput {
	return o
}

func (o ApplicationLoadBalancerMapOutput) ToApplicationLoadBalancerMapOutputWithContext(ctx context.Context) ApplicationLoadBalancerMapOutput {
	return o
}

func (o ApplicationLoadBalancerMapOutput) MapIndex(k pulumi.StringInput) ApplicationLoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ApplicationLoadBalancer {
		return vs[0].(map[string]ApplicationLoadBalancer)[vs[1].(string)]
	}).(ApplicationLoadBalancerOutput)
}

func init() {
	pulumi.RegisterOutputType(ApplicationLoadBalancerOutput{})
	pulumi.RegisterOutputType(ApplicationLoadBalancerPtrOutput{})
	pulumi.RegisterOutputType(ApplicationLoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(ApplicationLoadBalancerMapOutput{})
}