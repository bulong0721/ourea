// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package io.ourea.adapter.model;

public interface ServerTLSSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.ServerTLSSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If set to true, the load balancer will send a 301 redirect for
   * all http connections, asking the clients to use HTTPS.
   * </pre>
   *
   * <code>bool https_redirect = 1;</code>
   * @return The httpsRedirect.
   */
  boolean getHttpsRedirect();

  /**
   * <pre>
   * Optional: Indicates whether connections to this port should be
   * secured using TLS. The value of this field determines how TLS is
   * enforced.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSmode mode = 2;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * Optional: Indicates whether connections to this port should be
   * secured using TLS. The value of this field determines how TLS is
   * enforced.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSmode mode = 2;</code>
   * @return The mode.
   */
  io.ourea.adapter.model.ServerTLSSettings.TLSmode getMode();

  /**
   * <pre>
   * REQUIRED if mode is `SIMPLE` or `MUTUAL`. The path to the file
   * holding the server-side TLS certificate to use.
   * </pre>
   *
   * <code>string server_certificate = 3;</code>
   * @return The serverCertificate.
   */
  java.lang.String getServerCertificate();
  /**
   * <pre>
   * REQUIRED if mode is `SIMPLE` or `MUTUAL`. The path to the file
   * holding the server-side TLS certificate to use.
   * </pre>
   *
   * <code>string server_certificate = 3;</code>
   * @return The bytes for serverCertificate.
   */
  com.google.protobuf.ByteString
      getServerCertificateBytes();

  /**
   * <pre>
   * REQUIRED if mode is `SIMPLE` or `MUTUAL`. The path to the file
   * holding the server's private key.
   * </pre>
   *
   * <code>string private_key = 4;</code>
   * @return The privateKey.
   */
  java.lang.String getPrivateKey();
  /**
   * <pre>
   * REQUIRED if mode is `SIMPLE` or `MUTUAL`. The path to the file
   * holding the server's private key.
   * </pre>
   *
   * <code>string private_key = 4;</code>
   * @return The bytes for privateKey.
   */
  com.google.protobuf.ByteString
      getPrivateKeyBytes();

  /**
   * <pre>
   * REQUIRED if mode is `MUTUAL`. The path to a file containing
   * certificate authority certificates to use in verifying a presented
   * client side certificate.
   * </pre>
   *
   * <code>string ca_certificates = 5;</code>
   * @return The caCertificates.
   */
  java.lang.String getCaCertificates();
  /**
   * <pre>
   * REQUIRED if mode is `MUTUAL`. The path to a file containing
   * certificate authority certificates to use in verifying a presented
   * client side certificate.
   * </pre>
   *
   * <code>string ca_certificates = 5;</code>
   * @return The bytes for caCertificates.
   */
  com.google.protobuf.ByteString
      getCaCertificatesBytes();

  /**
   * <pre>
   * For gateways running on Kubernetes, the name of the secret that
   * holds the TLS certs including the CA certificates. Applicable
   * only on Kubernetes. The secret (of type `generic`) should
   * contain the following keys and values: `key:
   * &lt;privateKey&gt;` and `cert: &lt;serverCert&gt;`. For mutual TLS, 
   * `cacert: &lt;CACertificate&gt;` can be provided in the same secret or 
   * a separate secret named `&lt;secret&gt;-cacert`.
   * Secret of type tls for server certificates along with
   * ca.crt key for CA certificates is also supported.
   * Only one of server certificates and CA certificate
   * or credentialName can be specified.
   * </pre>
   *
   * <code>string credential_name = 10;</code>
   * @return The credentialName.
   */
  java.lang.String getCredentialName();
  /**
   * <pre>
   * For gateways running on Kubernetes, the name of the secret that
   * holds the TLS certs including the CA certificates. Applicable
   * only on Kubernetes. The secret (of type `generic`) should
   * contain the following keys and values: `key:
   * &lt;privateKey&gt;` and `cert: &lt;serverCert&gt;`. For mutual TLS, 
   * `cacert: &lt;CACertificate&gt;` can be provided in the same secret or 
   * a separate secret named `&lt;secret&gt;-cacert`.
   * Secret of type tls for server certificates along with
   * ca.crt key for CA certificates is also supported.
   * Only one of server certificates and CA certificate
   * or credentialName can be specified.
   * </pre>
   *
   * <code>string credential_name = 10;</code>
   * @return The bytes for credentialName.
   */
  com.google.protobuf.ByteString
      getCredentialNameBytes();

  /**
   * <pre>
   * A list of alternate names to verify the subject identity in the
   * certificate presented by the client.
   * </pre>
   *
   * <code>repeated string subject_alt_names = 6;</code>
   * @return A list containing the subjectAltNames.
   */
  java.util.List<java.lang.String>
      getSubjectAltNamesList();
  /**
   * <pre>
   * A list of alternate names to verify the subject identity in the
   * certificate presented by the client.
   * </pre>
   *
   * <code>repeated string subject_alt_names = 6;</code>
   * @return The count of subjectAltNames.
   */
  int getSubjectAltNamesCount();
  /**
   * <pre>
   * A list of alternate names to verify the subject identity in the
   * certificate presented by the client.
   * </pre>
   *
   * <code>repeated string subject_alt_names = 6;</code>
   * @param index The index of the element to return.
   * @return The subjectAltNames at the given index.
   */
  java.lang.String getSubjectAltNames(int index);
  /**
   * <pre>
   * A list of alternate names to verify the subject identity in the
   * certificate presented by the client.
   * </pre>
   *
   * <code>repeated string subject_alt_names = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the subjectAltNames at the given index.
   */
  com.google.protobuf.ByteString
      getSubjectAltNamesBytes(int index);

  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes of the SKPIs of
   * authorized client certificates.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 11;</code>
   * @return A list containing the verifyCertificateSpki.
   */
  java.util.List<java.lang.String>
      getVerifyCertificateSpkiList();
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes of the SKPIs of
   * authorized client certificates.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 11;</code>
   * @return The count of verifyCertificateSpki.
   */
  int getVerifyCertificateSpkiCount();
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes of the SKPIs of
   * authorized client certificates.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 11;</code>
   * @param index The index of the element to return.
   * @return The verifyCertificateSpki at the given index.
   */
  java.lang.String getVerifyCertificateSpki(int index);
  /**
   * <pre>
   * An optional list of base64-encoded SHA-256 hashes of the SKPIs of
   * authorized client certificates.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_spki = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the verifyCertificateSpki at the given index.
   */
  com.google.protobuf.ByteString
      getVerifyCertificateSpkiBytes(int index);

  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes of the
   * authorized client certificates. Both simple and colon separated
   * formats are acceptable.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 12;</code>
   * @return A list containing the verifyCertificateHash.
   */
  java.util.List<java.lang.String>
      getVerifyCertificateHashList();
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes of the
   * authorized client certificates. Both simple and colon separated
   * formats are acceptable.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 12;</code>
   * @return The count of verifyCertificateHash.
   */
  int getVerifyCertificateHashCount();
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes of the
   * authorized client certificates. Both simple and colon separated
   * formats are acceptable.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 12;</code>
   * @param index The index of the element to return.
   * @return The verifyCertificateHash at the given index.
   */
  java.lang.String getVerifyCertificateHash(int index);
  /**
   * <pre>
   * An optional list of hex-encoded SHA-256 hashes of the
   * authorized client certificates. Both simple and colon separated
   * formats are acceptable.
   * Note: When both verify_certificate_hash and verify_certificate_spki
   * are specified, a hash matching either value will result in the
   * certificate being accepted.
   * </pre>
   *
   * <code>repeated string verify_certificate_hash = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the verifyCertificateHash at the given index.
   */
  com.google.protobuf.ByteString
      getVerifyCertificateHashBytes(int index);

  /**
   * <pre>
   * Optional: Minimum TLS protocol version.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSProtocol min_protocol_version = 7;</code>
   * @return The enum numeric value on the wire for minProtocolVersion.
   */
  int getMinProtocolVersionValue();
  /**
   * <pre>
   * Optional: Minimum TLS protocol version.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSProtocol min_protocol_version = 7;</code>
   * @return The minProtocolVersion.
   */
  io.ourea.adapter.model.ServerTLSSettings.TLSProtocol getMinProtocolVersion();

  /**
   * <pre>
   * Optional: Maximum TLS protocol version.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSProtocol max_protocol_version = 8;</code>
   * @return The enum numeric value on the wire for maxProtocolVersion.
   */
  int getMaxProtocolVersionValue();
  /**
   * <pre>
   * Optional: Maximum TLS protocol version.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings.TLSProtocol max_protocol_version = 8;</code>
   * @return The maxProtocolVersion.
   */
  io.ourea.adapter.model.ServerTLSSettings.TLSProtocol getMaxProtocolVersion();

  /**
   * <pre>
   * Optional: If specified, only support the specified cipher list.
   * Otherwise default to the default cipher list supported by Envoy.
   * </pre>
   *
   * <code>repeated string cipher_suites = 9;</code>
   * @return A list containing the cipherSuites.
   */
  java.util.List<java.lang.String>
      getCipherSuitesList();
  /**
   * <pre>
   * Optional: If specified, only support the specified cipher list.
   * Otherwise default to the default cipher list supported by Envoy.
   * </pre>
   *
   * <code>repeated string cipher_suites = 9;</code>
   * @return The count of cipherSuites.
   */
  int getCipherSuitesCount();
  /**
   * <pre>
   * Optional: If specified, only support the specified cipher list.
   * Otherwise default to the default cipher list supported by Envoy.
   * </pre>
   *
   * <code>repeated string cipher_suites = 9;</code>
   * @param index The index of the element to return.
   * @return The cipherSuites at the given index.
   */
  java.lang.String getCipherSuites(int index);
  /**
   * <pre>
   * Optional: If specified, only support the specified cipher list.
   * Otherwise default to the default cipher list supported by Envoy.
   * </pre>
   *
   * <code>repeated string cipher_suites = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cipherSuites at the given index.
   */
  com.google.protobuf.ByteString
      getCipherSuitesBytes(int index);
}
