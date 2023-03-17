// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dns.NewRecord(ctx, "record", &dns.RecordArgs{
//				HostRecord: pulumi.String("@"),
//				Type:       pulumi.String("A"),
//				Value:      pulumi.String("192.168.99.99"),
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
// RDS record can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:dns/record:Record example <id>
//
// ```
type Record struct {
	pulumi.CustomResourceState

	// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
	HostRecord pulumi.StringOutput `pulumi:"hostRecord"`
	Locked     pulumi.BoolOutput   `pulumi:"locked"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	Name pulumi.StringOutput `pulumi:"name"`
	// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
	Routing pulumi.StringPtrOutput `pulumi:"routing"`
	// The record status. `Enable` or `Disable`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
	Ttl pulumi.IntPtrOutput `pulumi:"ttl"`
	// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewRecord registers a new resource with the given unique name, arguments, and options.
func NewRecord(ctx *pulumi.Context,
	name string, args *RecordArgs, opts ...pulumi.ResourceOption) (*Record, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostRecord == nil {
		return nil, errors.New("invalid value for required argument 'HostRecord'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	var resource Record
	err := ctx.RegisterResource("alicloud:dns/record:Record", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRecord gets an existing Record resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RecordState, opts ...pulumi.ResourceOption) (*Record, error) {
	var resource Record
	err := ctx.ReadResource("alicloud:dns/record:Record", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Record resources.
type recordState struct {
	// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
	HostRecord *string `pulumi:"hostRecord"`
	Locked     *bool   `pulumi:"locked"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	Name *string `pulumi:"name"`
	// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
	Priority *int `pulumi:"priority"`
	// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
	Routing *string `pulumi:"routing"`
	// The record status. `Enable` or `Disable`.
	Status *string `pulumi:"status"`
	// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
	Ttl *int `pulumi:"ttl"`
	// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
	Type *string `pulumi:"type"`
	// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
	Value *string `pulumi:"value"`
}

type RecordState struct {
	// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
	HostRecord pulumi.StringPtrInput
	Locked     pulumi.BoolPtrInput
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	Name pulumi.StringPtrInput
	// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
	Priority pulumi.IntPtrInput
	// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
	Routing pulumi.StringPtrInput
	// The record status. `Enable` or `Disable`.
	Status pulumi.StringPtrInput
	// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
	Ttl pulumi.IntPtrInput
	// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
	Type pulumi.StringPtrInput
	// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
	Value pulumi.StringPtrInput
}

func (RecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*recordState)(nil)).Elem()
}

type recordArgs struct {
	// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
	HostRecord string `pulumi:"hostRecord"`
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	Name *string `pulumi:"name"`
	// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
	Priority *int `pulumi:"priority"`
	// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
	Routing *string `pulumi:"routing"`
	// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
	Ttl *int `pulumi:"ttl"`
	// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
	Type string `pulumi:"type"`
	// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a Record resource.
type RecordArgs struct {
	// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
	HostRecord pulumi.StringInput
	// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	Name pulumi.StringPtrInput
	// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
	Priority pulumi.IntPtrInput
	// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
	Routing pulumi.StringPtrInput
	// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
	Ttl pulumi.IntPtrInput
	// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
	Type pulumi.StringInput
	// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
	Value pulumi.StringInput
}

func (RecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*recordArgs)(nil)).Elem()
}

type RecordInput interface {
	pulumi.Input

	ToRecordOutput() RecordOutput
	ToRecordOutputWithContext(ctx context.Context) RecordOutput
}

func (*Record) ElementType() reflect.Type {
	return reflect.TypeOf((**Record)(nil)).Elem()
}

func (i *Record) ToRecordOutput() RecordOutput {
	return i.ToRecordOutputWithContext(context.Background())
}

func (i *Record) ToRecordOutputWithContext(ctx context.Context) RecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordOutput)
}

// RecordArrayInput is an input type that accepts RecordArray and RecordArrayOutput values.
// You can construct a concrete instance of `RecordArrayInput` via:
//
//	RecordArray{ RecordArgs{...} }
type RecordArrayInput interface {
	pulumi.Input

	ToRecordArrayOutput() RecordArrayOutput
	ToRecordArrayOutputWithContext(context.Context) RecordArrayOutput
}

type RecordArray []RecordInput

func (RecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Record)(nil)).Elem()
}

func (i RecordArray) ToRecordArrayOutput() RecordArrayOutput {
	return i.ToRecordArrayOutputWithContext(context.Background())
}

func (i RecordArray) ToRecordArrayOutputWithContext(ctx context.Context) RecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordArrayOutput)
}

// RecordMapInput is an input type that accepts RecordMap and RecordMapOutput values.
// You can construct a concrete instance of `RecordMapInput` via:
//
//	RecordMap{ "key": RecordArgs{...} }
type RecordMapInput interface {
	pulumi.Input

	ToRecordMapOutput() RecordMapOutput
	ToRecordMapOutputWithContext(context.Context) RecordMapOutput
}

type RecordMap map[string]RecordInput

func (RecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Record)(nil)).Elem()
}

func (i RecordMap) ToRecordMapOutput() RecordMapOutput {
	return i.ToRecordMapOutputWithContext(context.Background())
}

func (i RecordMap) ToRecordMapOutputWithContext(ctx context.Context) RecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordMapOutput)
}

type RecordOutput struct{ *pulumi.OutputState }

func (RecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Record)(nil)).Elem()
}

func (o RecordOutput) ToRecordOutput() RecordOutput {
	return o
}

func (o RecordOutput) ToRecordOutputWithContext(ctx context.Context) RecordOutput {
	return o
}

// Host record for the domain record. This hostRecord can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
func (o RecordOutput) HostRecord() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.HostRecord }).(pulumi.StringOutput)
}

func (o RecordOutput) Locked() pulumi.BoolOutput {
	return o.ApplyT(func(v *Record) pulumi.BoolOutput { return v.Locked }).(pulumi.BoolOutput)
}

// Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
func (o RecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
func (o RecordOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// The resolution line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`, `drpeng`, `btvn`, .etc. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`. For checking all resolution lines enumeration please visit [Alibaba Cloud DNS doc](https://www.alibabacloud.com/help/doc-detail/34339.htm) or using dns.getResolutionLines in data source to get the value.
func (o RecordOutput) Routing() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.StringPtrOutput { return v.Routing }).(pulumi.StringPtrOutput)
}

// The record status. `Enable` or `Disable`.
func (o RecordOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
func (o RecordOutput) Ttl() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.IntPtrOutput { return v.Ttl }).(pulumi.IntPtrOutput)
}

// The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`CAA`, `REDIRECT_URL` and `FORWORD_URL`.
func (o RecordOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The value of domain record, When the `type` is `MX`,`NS`,`CNAME`,`SRV`, the server will treat the `value` as a fully qualified domain name, so it's no need to add a `.` at the end.
func (o RecordOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type RecordArrayOutput struct{ *pulumi.OutputState }

func (RecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Record)(nil)).Elem()
}

func (o RecordArrayOutput) ToRecordArrayOutput() RecordArrayOutput {
	return o
}

func (o RecordArrayOutput) ToRecordArrayOutputWithContext(ctx context.Context) RecordArrayOutput {
	return o
}

func (o RecordArrayOutput) Index(i pulumi.IntInput) RecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Record {
		return vs[0].([]*Record)[vs[1].(int)]
	}).(RecordOutput)
}

type RecordMapOutput struct{ *pulumi.OutputState }

func (RecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Record)(nil)).Elem()
}

func (o RecordMapOutput) ToRecordMapOutput() RecordMapOutput {
	return o
}

func (o RecordMapOutput) ToRecordMapOutputWithContext(ctx context.Context) RecordMapOutput {
	return o
}

func (o RecordMapOutput) MapIndex(k pulumi.StringInput) RecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Record {
		return vs[0].(map[string]*Record)[vs[1].(string)]
	}).(RecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RecordInput)(nil)).Elem(), &Record{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordArrayInput)(nil)).Elem(), RecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordMapInput)(nil)).Elem(), RecordMap{})
	pulumi.RegisterOutputType(RecordOutput{})
	pulumi.RegisterOutputType(RecordArrayOutput{})
	pulumi.RegisterOutputType(RecordMapOutput{})
}
