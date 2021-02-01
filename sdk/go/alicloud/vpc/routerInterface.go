// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// The router interface can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:vpc/routerInterface:RouterInterface interface ri-abc123456
// ```
type RouterInterface struct {
	pulumi.CustomResourceState

	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	AccessPointId pulumi.StringOutput `pulumi:"accessPointId"`
	// Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckTargetIp` must be specified at the same time.
	HealthCheckSourceIp pulumi.StringPtrOutput `pulumi:"healthCheckSourceIp"`
	// Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckSourceIp` must be specified at the same time.
	HealthCheckTargetIp pulumi.StringPtrOutput `pulumi:"healthCheckTargetIp"`
	// The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and oppositeRegion are the same.
	InstanceChargeType pulumi.StringPtrOutput `pulumi:"instanceChargeType"`
	// Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
	// If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
	Name pulumi.StringOutput `pulumi:"name"`
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	OppositeAccessPointId pulumi.StringPtrOutput `pulumi:"oppositeAccessPointId"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	OppositeInterfaceId pulumi.StringOutput `pulumi:"oppositeInterfaceId"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_owner_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_owner_id' instead.
	OppositeInterfaceOwnerId pulumi.StringOutput `pulumi:"oppositeInterfaceOwnerId"`
	// The Region of peer side.
	OppositeRegion pulumi.StringOutput `pulumi:"oppositeRegion"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_router_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	OppositeRouterId pulumi.StringOutput `pulumi:"oppositeRouterId"`
	// It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	//
	// Deprecated: Attribute 'opposite_router_type' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	OppositeRouterType pulumi.StringOutput `pulumi:"oppositeRouterType"`
	// The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
	Role pulumi.StringOutput `pulumi:"role"`
	// The Router ID.
	RouterId pulumi.StringOutput `pulumi:"routerId"`
	// Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
	RouterType pulumi.StringOutput `pulumi:"routerType"`
	// Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
	Specification pulumi.StringPtrOutput `pulumi:"specification"`
}

// NewRouterInterface registers a new resource with the given unique name, arguments, and options.
func NewRouterInterface(ctx *pulumi.Context,
	name string, args *RouterInterfaceArgs, opts ...pulumi.ResourceOption) (*RouterInterface, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OppositeRegion == nil {
		return nil, errors.New("invalid value for required argument 'OppositeRegion'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.RouterId == nil {
		return nil, errors.New("invalid value for required argument 'RouterId'")
	}
	if args.RouterType == nil {
		return nil, errors.New("invalid value for required argument 'RouterType'")
	}
	var resource RouterInterface
	err := ctx.RegisterResource("alicloud:vpc/routerInterface:RouterInterface", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouterInterface gets an existing RouterInterface resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouterInterface(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouterInterfaceState, opts ...pulumi.ResourceOption) (*RouterInterface, error) {
	var resource RouterInterface
	err := ctx.ReadResource("alicloud:vpc/routerInterface:RouterInterface", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouterInterface resources.
type routerInterfaceState struct {
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	AccessPointId *string `pulumi:"accessPointId"`
	// Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
	Description *string `pulumi:"description"`
	// Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckTargetIp` must be specified at the same time.
	HealthCheckSourceIp *string `pulumi:"healthCheckSourceIp"`
	// Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckSourceIp` must be specified at the same time.
	HealthCheckTargetIp *string `pulumi:"healthCheckTargetIp"`
	// The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and oppositeRegion are the same.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
	// If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
	Name *string `pulumi:"name"`
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	OppositeAccessPointId *string `pulumi:"oppositeAccessPointId"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	OppositeInterfaceId *string `pulumi:"oppositeInterfaceId"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_owner_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_owner_id' instead.
	OppositeInterfaceOwnerId *string `pulumi:"oppositeInterfaceOwnerId"`
	// The Region of peer side.
	OppositeRegion *string `pulumi:"oppositeRegion"`
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_router_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	OppositeRouterId *string `pulumi:"oppositeRouterId"`
	// It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	//
	// Deprecated: Attribute 'opposite_router_type' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	OppositeRouterType *string `pulumi:"oppositeRouterType"`
	// The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
	Period *int `pulumi:"period"`
	// The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
	Role *string `pulumi:"role"`
	// The Router ID.
	RouterId *string `pulumi:"routerId"`
	// Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
	RouterType *string `pulumi:"routerType"`
	// Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
	Specification *string `pulumi:"specification"`
}

type RouterInterfaceState struct {
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	AccessPointId pulumi.StringPtrInput
	// Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
	Description pulumi.StringPtrInput
	// Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckTargetIp` must be specified at the same time.
	HealthCheckSourceIp pulumi.StringPtrInput
	// Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckSourceIp` must be specified at the same time.
	HealthCheckTargetIp pulumi.StringPtrInput
	// The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and oppositeRegion are the same.
	InstanceChargeType pulumi.StringPtrInput
	// Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
	// If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
	Name pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	OppositeAccessPointId pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	OppositeInterfaceId pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_id' instead.
	//
	// Deprecated: Attribute 'opposite_interface_owner_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_interface_owner_id' instead.
	OppositeInterfaceOwnerId pulumi.StringPtrInput
	// The Region of peer side.
	OppositeRegion pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	//
	// Deprecated: Attribute 'opposite_router_id' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_id' instead.
	OppositeRouterId pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0. resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	//
	// Deprecated: Attribute 'opposite_router_type' has been deprecated from version 1.11.0. Use resource alicloud_router_interface_connection's 'opposite_router_type' instead.
	OppositeRouterType pulumi.StringPtrInput
	// The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
	Period pulumi.IntPtrInput
	// The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
	Role pulumi.StringPtrInput
	// The Router ID.
	RouterId pulumi.StringPtrInput
	// Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
	RouterType pulumi.StringPtrInput
	// Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
	Specification pulumi.StringPtrInput
}

func (RouterInterfaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*routerInterfaceState)(nil)).Elem()
}

type routerInterfaceArgs struct {
	// Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
	Description *string `pulumi:"description"`
	// Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckTargetIp` must be specified at the same time.
	HealthCheckSourceIp *string `pulumi:"healthCheckSourceIp"`
	// Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckSourceIp` must be specified at the same time.
	HealthCheckTargetIp *string `pulumi:"healthCheckTargetIp"`
	// The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and oppositeRegion are the same.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
	// If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
	Name *string `pulumi:"name"`
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	OppositeAccessPointId *string `pulumi:"oppositeAccessPointId"`
	// The Region of peer side.
	OppositeRegion string `pulumi:"oppositeRegion"`
	// The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
	Period *int `pulumi:"period"`
	// The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
	Role string `pulumi:"role"`
	// The Router ID.
	RouterId string `pulumi:"routerId"`
	// Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
	RouterType string `pulumi:"routerType"`
	// Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
	Specification *string `pulumi:"specification"`
}

// The set of arguments for constructing a RouterInterface resource.
type RouterInterfaceArgs struct {
	// Description of the router interface. It can be 2-256 characters long or left blank. It cannot start with http:// and https://.
	Description pulumi.StringPtrInput
	// Used as the Packet Source IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckTargetIp` must be specified at the same time.
	HealthCheckSourceIp pulumi.StringPtrInput
	// Used as the Packet Target IP of health check for disaster recovery or ECMP. It is only valid when `routerType` is `VBR`. The IP must be an unused IP in the local VPC. It and `healthCheckSourceIp` must be specified at the same time.
	HealthCheckTargetIp pulumi.StringPtrInput
	// The billing method of the router interface. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid". Router Interface doesn't support "PrePaid" when region and oppositeRegion are the same.
	InstanceChargeType pulumi.StringPtrInput
	// Name of the router interface. Length must be 2-80 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted.
	// If it is not specified, the default value is interface ID. The name cannot start with http:// and https://.
	Name pulumi.StringPtrInput
	// It has been deprecated from version 1.11.0.
	//
	// Deprecated: Attribute 'opposite_access_point_id' has been deprecated from version 1.11.0.
	OppositeAccessPointId pulumi.StringPtrInput
	// The Region of peer side.
	OppositeRegion pulumi.StringInput
	// The duration that you will buy the resource, in month. It is valid when `instanceChargeType` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
	Period pulumi.IntPtrInput
	// The role the router interface plays. Optional value: `InitiatingSide`, `AcceptingSide`.
	Role pulumi.StringInput
	// The Router ID.
	RouterId pulumi.StringInput
	// Router Type. Optional value: VRouter, VBR. Accepting side router interface type only be VRouter.
	RouterType pulumi.StringInput
	// Specification of router interfaces. It is valid when `role` is `InitiatingSide`. Accepting side's role is default to set as 'Negative'. For more about the specification, refer to [Router interface specification](https://www.alibabacloud.com/help/doc-detail/36037.htm).
	Specification pulumi.StringPtrInput
}

func (RouterInterfaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routerInterfaceArgs)(nil)).Elem()
}

type RouterInterfaceInput interface {
	pulumi.Input

	ToRouterInterfaceOutput() RouterInterfaceOutput
	ToRouterInterfaceOutputWithContext(ctx context.Context) RouterInterfaceOutput
}

func (*RouterInterface) ElementType() reflect.Type {
	return reflect.TypeOf((*RouterInterface)(nil))
}

func (i *RouterInterface) ToRouterInterfaceOutput() RouterInterfaceOutput {
	return i.ToRouterInterfaceOutputWithContext(context.Background())
}

func (i *RouterInterface) ToRouterInterfaceOutputWithContext(ctx context.Context) RouterInterfaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterInterfaceOutput)
}

type RouterInterfaceOutput struct {
	*pulumi.OutputState
}

func (RouterInterfaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RouterInterface)(nil))
}

func (o RouterInterfaceOutput) ToRouterInterfaceOutput() RouterInterfaceOutput {
	return o
}

func (o RouterInterfaceOutput) ToRouterInterfaceOutputWithContext(ctx context.Context) RouterInterfaceOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(RouterInterfaceOutput{})
}
