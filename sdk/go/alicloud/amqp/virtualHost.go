// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package amqp

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RabbitMQ (AMQP) Virtual Host resource.
//
// For information about RabbitMQ (AMQP) Virtual Host and how to use it, see [What is Virtual Host](https://www.alibabacloud.com/help/product/100989.html).
//
// > **NOTE:** Available in v1.126.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/amqp"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := amqp.NewVirtualHost(ctx, "example", &amqp.VirtualHostArgs{
// 			InstanceId:      pulumi.String("amqp-abc12345"),
// 			VirtualHostName: pulumi.String("my-VirtualHost"),
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
// RabbitMQ (AMQP) Virtual Host can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:amqp/virtualHost:VirtualHost example <instance_id>:<virtual_host_name>
// ```
type VirtualHost struct {
	pulumi.CustomResourceState

	// InstanceId.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// VirtualHostName.
	VirtualHostName pulumi.StringOutput `pulumi:"virtualHostName"`
}

// NewVirtualHost registers a new resource with the given unique name, arguments, and options.
func NewVirtualHost(ctx *pulumi.Context,
	name string, args *VirtualHostArgs, opts ...pulumi.ResourceOption) (*VirtualHost, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.VirtualHostName == nil {
		return nil, errors.New("invalid value for required argument 'VirtualHostName'")
	}
	var resource VirtualHost
	err := ctx.RegisterResource("alicloud:amqp/virtualHost:VirtualHost", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualHost gets an existing VirtualHost resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualHost(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualHostState, opts ...pulumi.ResourceOption) (*VirtualHost, error) {
	var resource VirtualHost
	err := ctx.ReadResource("alicloud:amqp/virtualHost:VirtualHost", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualHost resources.
type virtualHostState struct {
	// InstanceId.
	InstanceId *string `pulumi:"instanceId"`
	// VirtualHostName.
	VirtualHostName *string `pulumi:"virtualHostName"`
}

type VirtualHostState struct {
	// InstanceId.
	InstanceId pulumi.StringPtrInput
	// VirtualHostName.
	VirtualHostName pulumi.StringPtrInput
}

func (VirtualHostState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualHostState)(nil)).Elem()
}

type virtualHostArgs struct {
	// InstanceId.
	InstanceId string `pulumi:"instanceId"`
	// VirtualHostName.
	VirtualHostName string `pulumi:"virtualHostName"`
}

// The set of arguments for constructing a VirtualHost resource.
type VirtualHostArgs struct {
	// InstanceId.
	InstanceId pulumi.StringInput
	// VirtualHostName.
	VirtualHostName pulumi.StringInput
}

func (VirtualHostArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualHostArgs)(nil)).Elem()
}

type VirtualHostInput interface {
	pulumi.Input

	ToVirtualHostOutput() VirtualHostOutput
	ToVirtualHostOutputWithContext(ctx context.Context) VirtualHostOutput
}

func (*VirtualHost) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualHost)(nil))
}

func (i *VirtualHost) ToVirtualHostOutput() VirtualHostOutput {
	return i.ToVirtualHostOutputWithContext(context.Background())
}

func (i *VirtualHost) ToVirtualHostOutputWithContext(ctx context.Context) VirtualHostOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHostOutput)
}

func (i *VirtualHost) ToVirtualHostPtrOutput() VirtualHostPtrOutput {
	return i.ToVirtualHostPtrOutputWithContext(context.Background())
}

func (i *VirtualHost) ToVirtualHostPtrOutputWithContext(ctx context.Context) VirtualHostPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHostPtrOutput)
}

type VirtualHostPtrInput interface {
	pulumi.Input

	ToVirtualHostPtrOutput() VirtualHostPtrOutput
	ToVirtualHostPtrOutputWithContext(ctx context.Context) VirtualHostPtrOutput
}

type virtualHostPtrType VirtualHostArgs

func (*virtualHostPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualHost)(nil))
}

func (i *virtualHostPtrType) ToVirtualHostPtrOutput() VirtualHostPtrOutput {
	return i.ToVirtualHostPtrOutputWithContext(context.Background())
}

func (i *virtualHostPtrType) ToVirtualHostPtrOutputWithContext(ctx context.Context) VirtualHostPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHostPtrOutput)
}

// VirtualHostArrayInput is an input type that accepts VirtualHostArray and VirtualHostArrayOutput values.
// You can construct a concrete instance of `VirtualHostArrayInput` via:
//
//          VirtualHostArray{ VirtualHostArgs{...} }
type VirtualHostArrayInput interface {
	pulumi.Input

	ToVirtualHostArrayOutput() VirtualHostArrayOutput
	ToVirtualHostArrayOutputWithContext(context.Context) VirtualHostArrayOutput
}

type VirtualHostArray []VirtualHostInput

func (VirtualHostArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualHost)(nil)).Elem()
}

func (i VirtualHostArray) ToVirtualHostArrayOutput() VirtualHostArrayOutput {
	return i.ToVirtualHostArrayOutputWithContext(context.Background())
}

func (i VirtualHostArray) ToVirtualHostArrayOutputWithContext(ctx context.Context) VirtualHostArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHostArrayOutput)
}

// VirtualHostMapInput is an input type that accepts VirtualHostMap and VirtualHostMapOutput values.
// You can construct a concrete instance of `VirtualHostMapInput` via:
//
//          VirtualHostMap{ "key": VirtualHostArgs{...} }
type VirtualHostMapInput interface {
	pulumi.Input

	ToVirtualHostMapOutput() VirtualHostMapOutput
	ToVirtualHostMapOutputWithContext(context.Context) VirtualHostMapOutput
}

type VirtualHostMap map[string]VirtualHostInput

func (VirtualHostMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualHost)(nil)).Elem()
}

func (i VirtualHostMap) ToVirtualHostMapOutput() VirtualHostMapOutput {
	return i.ToVirtualHostMapOutputWithContext(context.Background())
}

func (i VirtualHostMap) ToVirtualHostMapOutputWithContext(ctx context.Context) VirtualHostMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHostMapOutput)
}

type VirtualHostOutput struct{ *pulumi.OutputState }

func (VirtualHostOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualHost)(nil))
}

func (o VirtualHostOutput) ToVirtualHostOutput() VirtualHostOutput {
	return o
}

func (o VirtualHostOutput) ToVirtualHostOutputWithContext(ctx context.Context) VirtualHostOutput {
	return o
}

func (o VirtualHostOutput) ToVirtualHostPtrOutput() VirtualHostPtrOutput {
	return o.ToVirtualHostPtrOutputWithContext(context.Background())
}

func (o VirtualHostOutput) ToVirtualHostPtrOutputWithContext(ctx context.Context) VirtualHostPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VirtualHost) *VirtualHost {
		return &v
	}).(VirtualHostPtrOutput)
}

type VirtualHostPtrOutput struct{ *pulumi.OutputState }

func (VirtualHostPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualHost)(nil))
}

func (o VirtualHostPtrOutput) ToVirtualHostPtrOutput() VirtualHostPtrOutput {
	return o
}

func (o VirtualHostPtrOutput) ToVirtualHostPtrOutputWithContext(ctx context.Context) VirtualHostPtrOutput {
	return o
}

func (o VirtualHostPtrOutput) Elem() VirtualHostOutput {
	return o.ApplyT(func(v *VirtualHost) VirtualHost {
		if v != nil {
			return *v
		}
		var ret VirtualHost
		return ret
	}).(VirtualHostOutput)
}

type VirtualHostArrayOutput struct{ *pulumi.OutputState }

func (VirtualHostArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VirtualHost)(nil))
}

func (o VirtualHostArrayOutput) ToVirtualHostArrayOutput() VirtualHostArrayOutput {
	return o
}

func (o VirtualHostArrayOutput) ToVirtualHostArrayOutputWithContext(ctx context.Context) VirtualHostArrayOutput {
	return o
}

func (o VirtualHostArrayOutput) Index(i pulumi.IntInput) VirtualHostOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VirtualHost {
		return vs[0].([]VirtualHost)[vs[1].(int)]
	}).(VirtualHostOutput)
}

type VirtualHostMapOutput struct{ *pulumi.OutputState }

func (VirtualHostMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]VirtualHost)(nil))
}

func (o VirtualHostMapOutput) ToVirtualHostMapOutput() VirtualHostMapOutput {
	return o
}

func (o VirtualHostMapOutput) ToVirtualHostMapOutputWithContext(ctx context.Context) VirtualHostMapOutput {
	return o
}

func (o VirtualHostMapOutput) MapIndex(k pulumi.StringInput) VirtualHostOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) VirtualHost {
		return vs[0].(map[string]VirtualHost)[vs[1].(string)]
	}).(VirtualHostOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHostInput)(nil)).Elem(), &VirtualHost{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHostPtrInput)(nil)).Elem(), &VirtualHost{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHostArrayInput)(nil)).Elem(), VirtualHostArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHostMapInput)(nil)).Elem(), VirtualHostMap{})
	pulumi.RegisterOutputType(VirtualHostOutput{})
	pulumi.RegisterOutputType(VirtualHostPtrOutput{})
	pulumi.RegisterOutputType(VirtualHostArrayOutput{})
	pulumi.RegisterOutputType(VirtualHostMapOutput{})
}
