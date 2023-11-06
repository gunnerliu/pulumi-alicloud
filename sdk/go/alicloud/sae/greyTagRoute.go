// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sae

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Serverless App Engine (SAE) GreyTagRoute resource.
//
// For information about Serverless App Engine (SAE) GreyTagRoute and how to use it, see [What is GreyTagRoute](https://www.alibabacloud.com/help/en/sae/latest/create-grey-tag-route).
//
// > **NOTE:** Available since v1.160.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sae"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultRegions, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "defaultSecurityGroup", &ecs.SecurityGroupArgs{
//				VpcId: defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultNamespace, err := sae.NewNamespace(ctx, "defaultNamespace", &sae.NamespaceArgs{
//				NamespaceId:             pulumi.String(fmt.Sprintf("%v:example", defaultRegions.Regions[0].Id)),
//				NamespaceName:           pulumi.String(name),
//				NamespaceDescription:    pulumi.String(name),
//				EnableMicroRegistration: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			defaultApplication, err := sae.NewApplication(ctx, "defaultApplication", &sae.ApplicationArgs{
//				AppDescription:  pulumi.String(name),
//				AppName:         pulumi.String(name),
//				NamespaceId:     defaultNamespace.ID(),
//				ImageUrl:        pulumi.String(fmt.Sprintf("registry-vpc.%v.aliyuncs.com/sae-demo-image/consumer:1.0", defaultRegions.Regions[0].Id)),
//				PackageType:     pulumi.String("Image"),
//				SecurityGroupId: defaultSecurityGroup.ID(),
//				VpcId:           defaultNetwork.ID(),
//				VswitchId:       defaultSwitch.ID(),
//				Timezone:        pulumi.String("Asia/Beijing"),
//				Replicas:        pulumi.Int(5),
//				Cpu:             pulumi.Int(500),
//				Memory:          pulumi.Int(2048),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sae.NewGreyTagRoute(ctx, "defaultGreyTagRoute", &sae.GreyTagRouteArgs{
//				GreyTagRouteName: pulumi.String(name),
//				Description:      pulumi.String(name),
//				AppId:            defaultApplication.ID(),
//				ScRules: sae.GreyTagRouteScRuleArray{
//					&sae.GreyTagRouteScRuleArgs{
//						Items: sae.GreyTagRouteScRuleItemArray{
//							&sae.GreyTagRouteScRuleItemArgs{
//								Type:     pulumi.String("param"),
//								Name:     pulumi.String("tfexample"),
//								Operator: pulumi.String("rawvalue"),
//								Value:    pulumi.String("example"),
//								Cond:     pulumi.String("=="),
//							},
//						},
//						Path:      pulumi.String("/tf/example"),
//						Condition: pulumi.String("AND"),
//					},
//				},
//				DubboRules: sae.GreyTagRouteDubboRuleArray{
//					&sae.GreyTagRouteDubboRuleArgs{
//						Items: sae.GreyTagRouteDubboRuleItemArray{
//							&sae.GreyTagRouteDubboRuleItemArgs{
//								Cond:     pulumi.String("=="),
//								Expr:     pulumi.String(".key1"),
//								Index:    pulumi.Int(1),
//								Operator: pulumi.String("rawvalue"),
//								Value:    pulumi.String("value1"),
//							},
//						},
//						Condition:   pulumi.String("OR"),
//						Group:       pulumi.String("DUBBO"),
//						MethodName:  pulumi.String("example"),
//						ServiceName: pulumi.String("com.example.service"),
//						Version:     pulumi.String("1.0.0"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Serverless App Engine (SAE) GreyTagRoute can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:sae/greyTagRoute:GreyTagRoute example <id>
//
// ```
type GreyTagRoute struct {
	pulumi.CustomResourceState

	// The ID  of the SAE Application.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The description of GreyTagRoute.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The grayscale rule created for Dubbo Application. See `dubboRules` below.
	DubboRules GreyTagRouteDubboRuleArrayOutput `pulumi:"dubboRules"`
	// The name of GreyTagRoute.
	GreyTagRouteName pulumi.StringOutput `pulumi:"greyTagRouteName"`
	// The grayscale rule created for SpringCloud Application. See `scRules` below.
	ScRules GreyTagRouteScRuleArrayOutput `pulumi:"scRules"`
}

// NewGreyTagRoute registers a new resource with the given unique name, arguments, and options.
func NewGreyTagRoute(ctx *pulumi.Context,
	name string, args *GreyTagRouteArgs, opts ...pulumi.ResourceOption) (*GreyTagRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.GreyTagRouteName == nil {
		return nil, errors.New("invalid value for required argument 'GreyTagRouteName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GreyTagRoute
	err := ctx.RegisterResource("alicloud:sae/greyTagRoute:GreyTagRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGreyTagRoute gets an existing GreyTagRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGreyTagRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GreyTagRouteState, opts ...pulumi.ResourceOption) (*GreyTagRoute, error) {
	var resource GreyTagRoute
	err := ctx.ReadResource("alicloud:sae/greyTagRoute:GreyTagRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GreyTagRoute resources.
type greyTagRouteState struct {
	// The ID  of the SAE Application.
	AppId *string `pulumi:"appId"`
	// The description of GreyTagRoute.
	Description *string `pulumi:"description"`
	// The grayscale rule created for Dubbo Application. See `dubboRules` below.
	DubboRules []GreyTagRouteDubboRule `pulumi:"dubboRules"`
	// The name of GreyTagRoute.
	GreyTagRouteName *string `pulumi:"greyTagRouteName"`
	// The grayscale rule created for SpringCloud Application. See `scRules` below.
	ScRules []GreyTagRouteScRule `pulumi:"scRules"`
}

type GreyTagRouteState struct {
	// The ID  of the SAE Application.
	AppId pulumi.StringPtrInput
	// The description of GreyTagRoute.
	Description pulumi.StringPtrInput
	// The grayscale rule created for Dubbo Application. See `dubboRules` below.
	DubboRules GreyTagRouteDubboRuleArrayInput
	// The name of GreyTagRoute.
	GreyTagRouteName pulumi.StringPtrInput
	// The grayscale rule created for SpringCloud Application. See `scRules` below.
	ScRules GreyTagRouteScRuleArrayInput
}

func (GreyTagRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*greyTagRouteState)(nil)).Elem()
}

type greyTagRouteArgs struct {
	// The ID  of the SAE Application.
	AppId string `pulumi:"appId"`
	// The description of GreyTagRoute.
	Description *string `pulumi:"description"`
	// The grayscale rule created for Dubbo Application. See `dubboRules` below.
	DubboRules []GreyTagRouteDubboRule `pulumi:"dubboRules"`
	// The name of GreyTagRoute.
	GreyTagRouteName string `pulumi:"greyTagRouteName"`
	// The grayscale rule created for SpringCloud Application. See `scRules` below.
	ScRules []GreyTagRouteScRule `pulumi:"scRules"`
}

// The set of arguments for constructing a GreyTagRoute resource.
type GreyTagRouteArgs struct {
	// The ID  of the SAE Application.
	AppId pulumi.StringInput
	// The description of GreyTagRoute.
	Description pulumi.StringPtrInput
	// The grayscale rule created for Dubbo Application. See `dubboRules` below.
	DubboRules GreyTagRouteDubboRuleArrayInput
	// The name of GreyTagRoute.
	GreyTagRouteName pulumi.StringInput
	// The grayscale rule created for SpringCloud Application. See `scRules` below.
	ScRules GreyTagRouteScRuleArrayInput
}

func (GreyTagRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*greyTagRouteArgs)(nil)).Elem()
}

type GreyTagRouteInput interface {
	pulumi.Input

	ToGreyTagRouteOutput() GreyTagRouteOutput
	ToGreyTagRouteOutputWithContext(ctx context.Context) GreyTagRouteOutput
}

func (*GreyTagRoute) ElementType() reflect.Type {
	return reflect.TypeOf((**GreyTagRoute)(nil)).Elem()
}

func (i *GreyTagRoute) ToGreyTagRouteOutput() GreyTagRouteOutput {
	return i.ToGreyTagRouteOutputWithContext(context.Background())
}

func (i *GreyTagRoute) ToGreyTagRouteOutputWithContext(ctx context.Context) GreyTagRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreyTagRouteOutput)
}

// GreyTagRouteArrayInput is an input type that accepts GreyTagRouteArray and GreyTagRouteArrayOutput values.
// You can construct a concrete instance of `GreyTagRouteArrayInput` via:
//
//	GreyTagRouteArray{ GreyTagRouteArgs{...} }
type GreyTagRouteArrayInput interface {
	pulumi.Input

	ToGreyTagRouteArrayOutput() GreyTagRouteArrayOutput
	ToGreyTagRouteArrayOutputWithContext(context.Context) GreyTagRouteArrayOutput
}

type GreyTagRouteArray []GreyTagRouteInput

func (GreyTagRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GreyTagRoute)(nil)).Elem()
}

func (i GreyTagRouteArray) ToGreyTagRouteArrayOutput() GreyTagRouteArrayOutput {
	return i.ToGreyTagRouteArrayOutputWithContext(context.Background())
}

func (i GreyTagRouteArray) ToGreyTagRouteArrayOutputWithContext(ctx context.Context) GreyTagRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreyTagRouteArrayOutput)
}

// GreyTagRouteMapInput is an input type that accepts GreyTagRouteMap and GreyTagRouteMapOutput values.
// You can construct a concrete instance of `GreyTagRouteMapInput` via:
//
//	GreyTagRouteMap{ "key": GreyTagRouteArgs{...} }
type GreyTagRouteMapInput interface {
	pulumi.Input

	ToGreyTagRouteMapOutput() GreyTagRouteMapOutput
	ToGreyTagRouteMapOutputWithContext(context.Context) GreyTagRouteMapOutput
}

type GreyTagRouteMap map[string]GreyTagRouteInput

func (GreyTagRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GreyTagRoute)(nil)).Elem()
}

func (i GreyTagRouteMap) ToGreyTagRouteMapOutput() GreyTagRouteMapOutput {
	return i.ToGreyTagRouteMapOutputWithContext(context.Background())
}

func (i GreyTagRouteMap) ToGreyTagRouteMapOutputWithContext(ctx context.Context) GreyTagRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreyTagRouteMapOutput)
}

type GreyTagRouteOutput struct{ *pulumi.OutputState }

func (GreyTagRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GreyTagRoute)(nil)).Elem()
}

func (o GreyTagRouteOutput) ToGreyTagRouteOutput() GreyTagRouteOutput {
	return o
}

func (o GreyTagRouteOutput) ToGreyTagRouteOutputWithContext(ctx context.Context) GreyTagRouteOutput {
	return o
}

// The ID  of the SAE Application.
func (o GreyTagRouteOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *GreyTagRoute) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// The description of GreyTagRoute.
func (o GreyTagRouteOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GreyTagRoute) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The grayscale rule created for Dubbo Application. See `dubboRules` below.
func (o GreyTagRouteOutput) DubboRules() GreyTagRouteDubboRuleArrayOutput {
	return o.ApplyT(func(v *GreyTagRoute) GreyTagRouteDubboRuleArrayOutput { return v.DubboRules }).(GreyTagRouteDubboRuleArrayOutput)
}

// The name of GreyTagRoute.
func (o GreyTagRouteOutput) GreyTagRouteName() pulumi.StringOutput {
	return o.ApplyT(func(v *GreyTagRoute) pulumi.StringOutput { return v.GreyTagRouteName }).(pulumi.StringOutput)
}

// The grayscale rule created for SpringCloud Application. See `scRules` below.
func (o GreyTagRouteOutput) ScRules() GreyTagRouteScRuleArrayOutput {
	return o.ApplyT(func(v *GreyTagRoute) GreyTagRouteScRuleArrayOutput { return v.ScRules }).(GreyTagRouteScRuleArrayOutput)
}

type GreyTagRouteArrayOutput struct{ *pulumi.OutputState }

func (GreyTagRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GreyTagRoute)(nil)).Elem()
}

func (o GreyTagRouteArrayOutput) ToGreyTagRouteArrayOutput() GreyTagRouteArrayOutput {
	return o
}

func (o GreyTagRouteArrayOutput) ToGreyTagRouteArrayOutputWithContext(ctx context.Context) GreyTagRouteArrayOutput {
	return o
}

func (o GreyTagRouteArrayOutput) Index(i pulumi.IntInput) GreyTagRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GreyTagRoute {
		return vs[0].([]*GreyTagRoute)[vs[1].(int)]
	}).(GreyTagRouteOutput)
}

type GreyTagRouteMapOutput struct{ *pulumi.OutputState }

func (GreyTagRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GreyTagRoute)(nil)).Elem()
}

func (o GreyTagRouteMapOutput) ToGreyTagRouteMapOutput() GreyTagRouteMapOutput {
	return o
}

func (o GreyTagRouteMapOutput) ToGreyTagRouteMapOutputWithContext(ctx context.Context) GreyTagRouteMapOutput {
	return o
}

func (o GreyTagRouteMapOutput) MapIndex(k pulumi.StringInput) GreyTagRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GreyTagRoute {
		return vs[0].(map[string]*GreyTagRoute)[vs[1].(string)]
	}).(GreyTagRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GreyTagRouteInput)(nil)).Elem(), &GreyTagRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*GreyTagRouteArrayInput)(nil)).Elem(), GreyTagRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GreyTagRouteMapInput)(nil)).Elem(), GreyTagRouteMap{})
	pulumi.RegisterOutputType(GreyTagRouteOutput{})
	pulumi.RegisterOutputType(GreyTagRouteArrayOutput{})
	pulumi.RegisterOutputType(GreyTagRouteMapOutput{})
}
